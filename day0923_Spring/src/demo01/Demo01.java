package demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao ud = (UserDao) ap.getBean("userdao");
        ud.saySpring();
        ap.close();
    }
}
