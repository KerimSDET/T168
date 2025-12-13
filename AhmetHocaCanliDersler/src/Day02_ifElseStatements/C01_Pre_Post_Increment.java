package Day02_ifElseStatements;

public class C01_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=40;


        System.out.println("Başlarken sayi1 değerimiz :" +sayi1);
        sayi1++; //sayi1 artık 21

        System.out.println("Sayı1 20 idi, şimdi :" + sayi1);

        ++sayi1;

        System.out.println("Sayı1 21 idi, şimdi :"+ sayi1);

        //sayı2'yi 1 artırın
        System.out.println("Başlarken sayi2 değerimiz : "+sayi2);

        sayi2++;
        //sonra sayı2'yi yazdırın
        System.out.println("Bir artırma işlemi yaptık şimdisayi1 : " +sayi2);

        //yukarıdaki işlemi tek satırda yapın
        System.out.println("İşlemi tek satırda yapalım : " + ++sayi2);

        System.out.println("sayi2'yi önce yazdırın : " +sayi2);

        //sonra 1 arıtırın
        sayi2++; //değeri 43 oldu

    }
}
