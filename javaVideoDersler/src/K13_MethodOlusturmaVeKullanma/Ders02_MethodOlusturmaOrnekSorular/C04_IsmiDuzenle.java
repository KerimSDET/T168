package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C04_IsmiDuzenle {

    public static void main(String[] args) {

        /*
        verilen isim ve soyismi alıp
        Isım ve Soyismi ilk harflerini büyük diğer harflerini küçük olacak şekilde
        isim boşluk soyisim şeklinde bize döndüren bir method oluşturun.
        input : isim : Ali soyisim : YILMAZ
        methıd return : Ali Yıilmaz
         */


        String str="ali";

        str.toUpperCase();
        System.out.println(str.toUpperCase());

        str=str.toLowerCase();

        System.out.println("Kalıcı hali "+str);

        //yeni veri testi method test

        ismiDuzenleDondur("ali","cabbar"); //ne koncsolda görünür ne de sonra kullanabiliriz

        System.out.println(ismiDuzenleDondur("ali", "cabbar")); //konsolda görünür

        String isimSabitleme =ismiDuzenleDondur("veli","perçin");

        System.out.println(isimSabitleme);


    }

    public static String ismiDuzenleDondur (String isim, String  soyIsim){

        String duzenlenmisIsim =

        isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+ " " +
                soyIsim.substring(0,1).toUpperCase() +
                soyIsim.substring(1).toLowerCase();


        return duzenlenmisIsim;

    }

}
