package com.fanruice.exercise.jingtaidaili;

/**
 * @description  学生代理类 保存一个学生实体，这样可以代理学生产生上交班费的行为
 * @author fanruice
 * @date   2018/11/8 15:00
 */
public class StudentsProxy implements Person {

    private Student student;//被代理的学生

    public StudentsProxy(Person person) {
        //只代理学生
        if(person.getClass() == Student.class) {
            this.student = (Student) person;
        }
    }

    @Override
    public void giveMoney() {
        System.out.println("班长代交班费");
        student.giveMoney();
    }
}
