package KeThuaOng;

public class CarOng {
    protected String carCompany = "toyota";
    protected String carType = "4 chỗ";

    public CarOng() {
    }

    public CarOng(String carCompany, String carType) {
        this.carCompany = carCompany;
        this.carType = carType;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
