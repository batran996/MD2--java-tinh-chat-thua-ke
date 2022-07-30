package KeThuaOng.KeThuaCha.KeThuaCon;

import KeThuaOng.KeThuaCha.CarCha;

public class CarCon extends CarCha {
    String nameCar = "camry";
     public String display (){
         return "thông tin xe: " + " xe " + nameCar +"\n" + "giá xe: " + price + "VND" + "\n" + "loại xe " + carType + "\n" + " hãng xe " + carCompany;
     }

}
