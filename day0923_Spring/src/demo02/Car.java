package demo02;

public class Car {
    private String cname;
    private double price;

    public Car() {
    }

    public Car(String cname, double price) {
        this.cname = cname;
        this.price = price;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.price, price) != 0) return false;
        return cname != null ? cname.equals(car.cname) : car.cname == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cname != null ? cname.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
