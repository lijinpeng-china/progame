package demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text1 {
    public static void main(String[] args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car c = (Car) ap.getBean("car");
        System.out.println(c);
    }
}
