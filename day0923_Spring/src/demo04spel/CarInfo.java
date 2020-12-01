package demo04spel;

public class CarInfo{
    private String cname;
    private double price;

    public CarInfo() {
    }

    public CarInfo(String cname, double price) {
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
        return "CarInfo{" +
                "cname='" + cname + '\'' +
                ", price=" + price +
                '}';
    }
}
