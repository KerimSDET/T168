package K20_Constructors.D02_ObjelereDegerAtamaVeParamatrizedConstructors;

public class C02_DefaultConstructor_ToStringKullanimi {


    public static void main(String[] args) {



        C01_Araba araba1=new C01_Araba();
        System.out.println(araba1.marka);
        System.out.println(araba1.model);
        System.out.println(araba1.renk);
        System.out.println(araba1.yil);
        System.out.println(araba1.fiyat);


        System.out.println("------------");

        C01_Araba araba2=new C01_Araba();
        araba2.marka = "Mercedes";
        araba2.model = "E200";
        araba2.renk="Siyah";
        araba2.yil=2022;
        araba2.fiyat=2650000;


        System.out.println(araba2.marka);
        System.out.println(araba2.model);
        System.out.println(araba2.renk);
        System.out.println(araba2.yil);
        System.out.println(araba2.fiyat);

        System.out.println("------------");

        C01_Araba araba3=new C01_Araba();





    }

}
