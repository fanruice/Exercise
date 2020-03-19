package com.fanruice.exercise;

import com.fanruice.exercise.CGlibProxy.CGlibProxy;
import com.fanruice.exercise.CGlibProxy.StudentImpl;
import com.fanruice.exercise.DongTaiDaiLi.StuInvocationHandler;
import com.fanruice.exercise.DongTaiDaiLi.StudentDong;
import com.fanruice.exercise.jingtaidaili.Person;
import com.fanruice.exercise.jingtaidaili.Student;
import com.fanruice.exercise.jingtaidaili.StudentsProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description  代理测试类
 * @author fanruice
 * @date   2018/11/15 11:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxyTest {

    /**
     * @description  CGlib实现动态代理测试方法
     * @author fanruice
     * @date   2018/11/15 13:47
     */
    @Test
    public void testCGlib() {
        CGlibProxy cGlibProxy = new CGlibProxy();
        Class[] classes = new Class[]{String.class};
        Object[] objects = new Object[]{"张三"};
        StudentImpl student = (StudentImpl) cGlibProxy.getProxy(StudentImpl.class, classes, objects);
        student.giveMoney();
    }

    /**
     * jdk为我们的生成了一个叫$Proxy0（这个名字后面的0是编号，有多个代理类会一次递增）的代理类，
     * 这个类文件时放在内存中的，我们在创建代理对象时，就是通过反射获得这个类的构造方法，然后创建的代理实例。
     * 通过对这个生成的代理类源码的查看，我们很容易能看出，动态代理实现的具体过程。
     * 我们可以对InvocationHandler看做一个中介类，中介类持有一个被代理对象，在invoke方法中调用了被代理对象的相应方法。
     * 通过聚合方式持有被代理对象的引用，把外部对invoke的调用最终都转为对被代理对象的调用。
     * 代理类调用自己方法时，通过自身持有的中介类对象来调用中介类对象的invoke方法，从而达到代理执行被代理对象的方法。
     * 也就是说，动态代理通过中介类实现了具体的代理功能。
     *
     * 生成的代理类：$Proxy0 extends Proxy implements Person，我们看到代理类继承了Proxy类，
     * 所以也就决定了java动态代理只能对接口进行代理，Java的继承机制注定了这些动态代理类们无法实现对class的动态代理。
     * 上面的动态代理的例子，其实就是AOP的一个简单实现了，在目标对象的方法执行之前和执行之后进行了处理，对方法耗时统计。
     * Spring的AOP实现其实也是用了Proxy和InvocationHandler这两个东西的。
     */
    @Test
    public void testJava() {
        //创建一个实例对象，这个对象是被代理的对象
        Person p1 = new StudentDong("张三");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(p1);
        //创建一个代理对象stuProxy来代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class}, stuHandler);
        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }

    @Test
    public void jingTest() {
        //被代理的学生张三，他的班费上交由代理对象（monitor）班长完成
        Person p1 = new Student("张三");
        //生成代理对象，并将张三传给代理对象
        Person monitor = new StudentsProxy(p1);
        //班长代理上交班费
        monitor.giveMoney();
    }
}
