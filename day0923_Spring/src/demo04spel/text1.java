package demo04spel;

import demo03.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text1 {
    public static void main(String[] args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spel.xml");
//        Car c = (Car) ap.getBean("car"); 
//        System.out.println(c);

        Person p = (Person) ap.getBean("person");
        System.out.println(p);
    }
}
