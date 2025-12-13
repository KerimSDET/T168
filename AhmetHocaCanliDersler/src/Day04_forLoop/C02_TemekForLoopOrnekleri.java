package Day04_forLoop;

public class C02_TemekForLoopOrnekleri {
    public static void main(String[] args) {

        //1 den 20 ye kadar, (1 ve 20 dahil) olan sayıların toplamını yazdırın

        int toplam = 0;

        for (int i = 1; i <=20 ; i++) {

            System.out.println(i+"+"+toplam);



        }
        System.out.println("Sayıların Toplamı 1: " + (toplam)); //toplam =toplam +i demektir.
        System.out.println("________________");

        //1278 den 2013 e kadar snırlar dahil sayıların toplamını yazdırın

        toplam =0;

        for (int i = 1278; i<=2013; i++) {


            toplam +=i;



        }System.out.println("Sayıların Toplamı 2: " +(toplam));

        System.out.println("---------");
//
//        //3 basamaklı çift sayıların toplamını yazdırın
//        //100,102, 104..... 998
//
//        toplam =0;
//
//        for (int i = 100; i <=998 ; i+=2) {
//
//            System.out.println("Sayıların Toplamı 3:" +toplam);
//
//        }
//
//        System.out.println("-----");
//
//
//        // 467 ile 763 arasında sınırlar dahil 17 ile bölünebilen sayıların toplamı
//
//        toplam =0;
//
//        for (int i = 467; i <=763 ; i+=2) {
//            //toplam+=i; //toplam = toplam+i
//
//            if (i%17 ==0){
//                toplam +=1;
//            }
//            System.out.println("Sayıların toplamı 4: "+toplam);
//
//        }


    }
}
