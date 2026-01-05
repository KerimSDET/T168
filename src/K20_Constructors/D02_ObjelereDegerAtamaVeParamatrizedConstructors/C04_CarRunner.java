package K20_Constructors.D02_ObjelereDegerAtamaVeParamatrizedConstructors;

public class C04_CarRunner {

    public static void main(String[] args) {

        C03_Car car1 =new C03_Car();

        System.out.println(car1.toString());

        System.out.println(car1); //toStringe özel bu durum var


        car1.marka="Audi";
        car1.model="A5";
        car1.renk="Siyah";
        car1.yil=2020;
        car1.fiyat=10000;

        System.out.println(car1);


    }
}
