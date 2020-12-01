package demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    public static void main(String[] args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Person p = (Person) ap.getBean("person");           
        System.out.println(p);
    }
}
