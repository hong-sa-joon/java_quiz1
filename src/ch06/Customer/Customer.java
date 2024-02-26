package ch06.Customer;

public class Customer {
    private String name;
    private String tel;
    private String home;
    private int point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Customer(String name, String tel, String home, int point) {
        this.name = name;
        this.tel = tel;
        this.home = home;
        this.point = point;
    }
}
