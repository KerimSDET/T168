package K12_forLoop.Ders01_forLoop;

public class C01_BasitDonguler {
    public static void main(String[] args) {

        //1 den başlayıp, 50 ye kadar (50 dahil) tek sayıları yazdırın

        for (int i =1; i <=50; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println("");


        //207'den başlayarak 400 den küçük olan sayıları yazdırın

        for (int i = 207; i < 400; i+=5) {
            System.out.print(i+" ");

        }

        System.out.println("");

        //2 basamaklı çift sayıların toplamı kaçtır

        int toplam = 0;

        for (int i = 10; i < 100; i+=2) {

            toplam+=i;

        } System.out.println("2 basamaklı çift sayıların toplamı :"+(toplam));


        System.out.println(" ");
        //40 sayısını kalansız bölebilen pozitif tamsayıları yazdırın

        int sayi = 40;

        for (int i = 1; i <=40 ; i++) {

        if (sayi%i==0) {
            System.out.print(i+" ");

        }
        }

        System.out.println(" ");
        //1000 den geriye doğru 3 basamaklı 37 ile bölünebilen sayıları yazdırın


        for (int i = 1000; i >100 ; i--) {
            if (i %37==0){
                System.out.print(i+" ");
            }

        }


        System.out.println(" ");

        //verilen başlangıç ve bitiş değerleri dahil olmak üzere
        //bu sayılar arasında 7 ile bölünebilen sayı adetini yazdırın.



        int baslangic = 235;
        int bitis = 1673;
        int sayac = 0;


        for (int i = baslangic; i <=bitis ; i++) {

            if (i%7==0){
                sayac++;
            }

        }
        System.out.println(baslangic+" ile "+bitis+" arasında 7 ile bölünebilen tamsayı adedi:"+sayac);

        System.out.println();


    }

}
