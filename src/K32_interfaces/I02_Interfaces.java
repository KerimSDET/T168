package K32_interfaces;

public interface I02_Interfaces {

    /*
        interface'de olusturulan her variable
        public static ve final'dir
        bu keyword'leri yazsak da, yazmasak da bu degismez
     */

    public static final int sayi= 20;
    public static final String str= "JAva Candır";
    //public static char chr; //değer atamandan kullanılamaz
    boolean bl =true;


    public static void main(String[] args) {

        System.out.println(bl); //true


    /*
          variable'larin onunde static yazmasa da
          static main method icinden kullanabiliriz
          cunku interface icindeki tum variable public, static ve final'dir
         */

       //sayi = 30;  //hata veriyor. final seğer son değeri almıştır ve sonradandeğer atanamaz
        System.out.println(sayi); //20
    /*
         variable'larin onunde final yazmasa da
         interface icindeki tum variable public, static ve final'dir
         final variable'larin degeri DEGISTIRILEMEZ

         Cannot assign a value to final variable 'sayi'
         */



        /*
         interface icinde olusturulan her variable public, static ve final'dir
         final oldugu icin sonradan degistirme imkani yoktur
         char chr;  normalde class level variable'lara atama yapmak zorunlu degildir
         Ancak interface'de sonradan atama yapamayacagimiz icin basta deger atamak ZORUNLUDUR
         */

        //chr = 'a';

        /*
         Genel bir kabul olarak
         Java'da public static final varioable'lar
         kullanicilarin dikkatini cekmek icin tamamen buyuk harflerle isimlendirilir
         */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.E);
        System.out.println(Math.PI);


    }

}
