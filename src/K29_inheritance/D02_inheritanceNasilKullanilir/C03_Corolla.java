package K29_inheritance.D02_inheritanceNasilKullanilir;

public class C03_Corolla extends C02_Toyota{


     /*
        Corolla da Toyota'nin bir modelidir
        yani Corolla IS-A Toyota diyebiliriz
        bu durumda Corolla Toyota'nin child'i olmali ve
        Tum Toyota araclarin sahip oldugu ORTAK OZELLIKLERE sahip olmalidir
     */
    /*
       1- baslangic itibariyle parent'i olan Toyota
          ve grand parent'i olan araba class'larindaki
          tum ozelliklere sahiptir
    */

    C03_Corolla(){
        //        System.out.println(model); // Model belirtilmedi
        //        System.out.println(motor); // Cevreye duyarli motor
        //        System.out.println(guvenlik); // DGS1001
    }

    /*
       2- Corolla class'i parent ve grand parent class'larindaki
          istedigi variable'lari kendisine UYARLAYABILIR
    */

    String model = "Corolla";
    String kasa = "Corolla Kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    /*
       3- Corolla class'i butun corolla araclarda olan
          ama parent class'i Toyota veya grand parent'i olan Araba class'larinda olmayan
          YENI variable'lar ekleyebilir
     */

    String uretimYeri = "Türkiye";
    String aku = "Inci akü";
    String renk = " renk seçilmedi";
    String yakitTuru = "yakıt türü seçilmedi";

    public static void main(String[] args) {

        C03_Corolla corolla1 = new C03_Corolla();

        System.out.println(corolla1.sanzuman); // Şanzuman seçilmedi
        corolla1.sanzuman = "Otomatik";

        System.out.println(corolla1.marka); //Totota
        System.out.println(corolla1.guvenlik);  //GGS1001
        System.out.println(corolla1.fren); //ABS

        System.out.println(corolla1.model); //Corolla
        System.out.println(corolla1.kasa);  //Corolla kasası
        System.out.println(corolla1.motor); // vvdi
        System.out.println(corolla1.lastik); //15" pirelli

        corolla1.lastik="15 inch Michelin";
        System.out.println(corolla1.lastik); // Michelin
        System.out.println(corolla1.uretimYeri); //Türkiye
        System.out.println(corolla1.aku); //İnci Akü
        corolla1.renk ="Mavi";
        System.out.println(corolla1.renk); //Mavi
        corolla1.yakitTuru = "Hybrit";
        System.out.println(corolla1.yakitTuru); //Hybrit


    } //main method sonu
}//Class sonu
