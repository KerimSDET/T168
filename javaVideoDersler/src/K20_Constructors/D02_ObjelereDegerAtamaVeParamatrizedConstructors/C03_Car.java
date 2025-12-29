package K20_Constructors.D02_ObjelereDegerAtamaVeParamatrizedConstructors;

public class C03_Car {

    String marka = "marka atanmamış";
    String model = "model atanmamış";
    String renk = "Renk atanmamış";
    int yil = 1900;
    int fiyat ;

    C03_Car(){
        marka = "Opel";
        yil = 1900;
        fiyat = 1000;
    }


    @Override
    public String toString() {
        return "C03_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
