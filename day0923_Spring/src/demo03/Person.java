package demo03;

import demo02.Car;

public class Person {
    private String pname;
    private Car car;

    public Person() {
    }

    public Person(String pname, Car car) {
        this.pname = pname;
        this.car = car;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", car=" + car +
                '}';
    }
}
