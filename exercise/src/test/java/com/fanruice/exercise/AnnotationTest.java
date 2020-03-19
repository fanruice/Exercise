package com.fanruice.exercise;

import com.fanruice.exercise.Annotation.ReqValue;
import com.fanruice.exercise.Annotation.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;

/**
 * @description  自定义注解测试类
 * @author fanruice
 * @date   2018/12/27 18:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {

    @Test
    public void reqValueTest() {
        Class<User> userClass = User.class;
        //获得User类的所有属性信息
        Field[] fields = userClass.getDeclaredFields();
        //获得类中所有属性的注解信息
        for (Field field : fields) {
            if (field.isAnnotationPresent(ReqValue.class)) { // 如果属性中包含ReqValue注解
                ReqValue reqValue = field.getAnnotation(ReqValue.class);// 获取属性中的ReqValue注解
                System.out.println(field.getName() + "值为：" + reqValue.values());// 取值
            }
        }
    }
}
