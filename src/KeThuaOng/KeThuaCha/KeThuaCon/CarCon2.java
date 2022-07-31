package KeThuaOng.KeThuaCha.KeThuaCon;

import KeThuaOng.KeThuaCha.CarCha;

public class CarCon2 extends CarCha {
    private String nameCar2 = "vios";

    public String display2() {
        return "thông tin xe 2: " + " tên: " + nameCar2 + " \n " + " giá xe: " + price + " VND " + "\n" + "loại xe " + carType + "\n" + " hãng xe " + carCompany;
    }
}
