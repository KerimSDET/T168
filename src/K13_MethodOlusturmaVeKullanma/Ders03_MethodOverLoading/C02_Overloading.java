package K13_MethodOlusturmaVeKullanma.Ders03_MethodOverLoading;

public class C02_Overloading {

    public static void main(String[] args) {

        topla(3,5);

        topla(3.4,5.6);

        topla(2.4,5);

        topla('a',6); //ASCII table değerine göre işlem yapar a:97

    }

    public static void topla (int a, int b){ //topla int int
        System.out.println("Iki int'in toplami : " +(a+b));
    }

    public static void topla (double a, double b){ //topla int int
        System.out.println("Iki double'in toplami : " +(a+b));
    }


}
