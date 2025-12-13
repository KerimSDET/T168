package K02_DataKullanimiVeVariables;

public class C02_VariableDikkatEdilecekler {


    public static void main() {


//bir variable için SADECE 1 kere deklarasyon yapılabilir
        //sonrasında bir daha deklarasyon yapılamaz
        //ama variable istendiği kadar kullnılabilir.


        int sayi = 20 ;

        //int sayi = 30;

        sayi = 30;

        System.out.println(sayi); //35

        // 2- eŞİTLİĞİN SOL TARAFINDA sadece variable olur sağ tarafta ise değer

        int yas = 20;

        yas = 2 * yas +2;

        // 2 *  yas = 40; //variable expected hatası verir



    }
}
