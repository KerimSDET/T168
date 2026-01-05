package K14_whileLoop;

public class C01_whileLoopVsForLoop {
    public static void main(String[] args) {

/*
eğer başlangıç ve bitiş değerleri biliniyorsa ve bir işlemi kaç kere tekrar edeceğimizi
biliyorsak for loop avantajlıdır

çünkü while loop
-başlangıç değeri
-bitiş değeri
-ve artış/azalış çıktılarını otomatik olarak bize vermez

 */


        //1'den 10'a kadar (1 ve 10 dahil) tüm sayıları toplayın


        int toplam =0;

        for (int i = 1; i <=10 ; i++) {
        toplam+=i;
        }
        System.out.println("For Loop ile 1-10 arası toplam "+toplam);



        int sayi = 1;

        toplam =0;

        while (sayi<=10){ //çalışmaya devam etme şartını yazıyoruz
        toplam+=sayi;
        sayi++; //kontrol edilen sayı için değişim unutulursa sonsuzluk olur
        }
        System.out.println("While ile 1dn 10 a kadar sayıalrın toplamı : "+toplam);

//20'den 30 a kadar olan sayıları (20 ve 30 dahil) çift sayıları çarpın ve yazdırın.

        int carpim =1;


        for (int i = 20; i <=30; i++) {

            if (i%2==0) {
                carpim*=i;
            }

        }
        System.out.println("for loop ile 20den 30 a  kadar çift sayıların çarpımı : "+carpim);





        sayi =20;

        carpim =1;

        while (sayi<=30){
            if (sayi%2==0) {
                carpim *= sayi;
                   }
            sayi++;


        }System.out.println("While ile carpim : " + carpim);






    }






}
