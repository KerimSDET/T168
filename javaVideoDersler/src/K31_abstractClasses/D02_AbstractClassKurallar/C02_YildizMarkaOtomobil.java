package K31_abstractClasses.D02_AbstractClassKurallar;

public class C02_YildizMarkaOtomobil extends C01_ArabaAbstractClass{

    /*
        Abstract class'lar bir obje olusturmak icin degil,
        kendisini parent edinecek child class'larin
        MUTLAKA kendisine uyarlamasi(implement) gereken
        method'lari belirleyen OZEL CLASS"LARDIR

        1- abstract parent class'daki
           abstract method'lar
           concrete child class'lar tarafindan MUTLAKA uyarlanmalidir
     */
    /*
        2- abstract parent class'daki
           concrete method'lar
           inheritance kurallarina tabiidir
           yanii
            - child isterse parent'daki concrete method'u aynen kullanir
            - isterse override edip kendisine uyarlar (implement)

     */
    /*
        3- Abstract class'lar class olduklari icin
           constructor'a sahiptir
           AMMA abstract class'daki abstract method'lar CALISTIRILAMAYACAGI icin
           ABSTRACT CLASS"LARDAN OBJE OLUSTURULAMAZ
      */
    /*
        4- Bir abstract class'a sonradan bir abstract method eklenirse
           o abstract class'a extends etmis olan tum concrete class'lar CTE verir
           yeni eklenen abstract method'u
           tum child class'lara implement etmeniz gerekir
       */
    /*
        5- Abstract class'in icinde hem abstract,
           hem de concrete method bulunabilir
           AMMAAA concrete class'da abstract method OLAMAZ
     */

   // public abstract void method10(); //concrete class içinde abstract method izin verilmez
    // Abstract method in non-abstract class

    public static void main(String[] args) {

    }

    @Override
    public void motor() {

    }

    @Override
    public void sase() {

    }


    public void gosterge() {

    }
}
