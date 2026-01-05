package K20_Constructors.D02_ObjelereDegerAtamaVeParamatrizedConstructors;

public class C05_Okul {

    String ogrIsim = "isim atanmamış";
    String ogrAdres ="adres atanmamış";
    String ogrTel="tel atanmamış";
    String ogrSube="sube atanmamış";

    @Override
    public String toString() {
        return "C05_Okul{" +
                "ogrIsım='" + ogrIsim + '\'' +
                ", ogrAdres='" + ogrAdres + '\'' +
                ", ogrTel='" + ogrTel + '\'' +
                ", ogrSube='" + ogrSube + '\'' +
                '}';
    }

    public double notOrtlaması (double not1, double not2){
        return (not1+not2)/2;

    }

    C05_Okul(){

    }


    C05_Okul(String isim, String adres, String tel){
        ogrIsim=isim;
        ogrAdres=adres;
        ogrTel=tel;
    }

    C05_Okul(String isim, String adres, String tel, String sube){
        ogrIsim=isim;
        ogrAdres=adres;
        ogrTel=tel;
        ogrSube=sube;
    }



}
