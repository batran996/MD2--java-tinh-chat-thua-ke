import KeThuaOng.KeThuaCha.CarCha;
import KeThuaOng.KeThuaCha.KeThuaCon.CarCon;
import KeThuaOng.KeThuaCha.KeThuaCon.CarCon2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CarCon ca1 = new CarCon();

        System.out.println(ca1.display());
        CarCon2 car2 = new CarCon2();
        System.out.println(car2.display2());
    }
}