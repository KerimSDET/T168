package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C01_AsalMiYazdir {
    public static void main(String[] args) {


        //verilen bri tamsayının,
        //asal sayı olup olmadığını kontrol edip, sonucu yazdıran bri mehhod oluştuusun

        asalMiYazdir(30);

        asalMiYazdir(47);

        asalMiYazdir(59);

        }

        public static void asalMiYazdir ( int sayi){

        for (int i = 2; i <sayi; i++) {

            if (sayi%i==0) {
                System.out.println("Verilen "+sayi+" sayısı Asal Değil");
                break;
            }

            if (i==sayi-1){
                System.out.println("Verilen "+sayi+" Sayısı Asaldır");
            }
    }

} }
