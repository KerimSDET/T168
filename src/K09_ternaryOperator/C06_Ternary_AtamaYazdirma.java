package K09_ternaryOperator;

public class C06_Ternary_AtamaYazdirma {
    public static void main(String[] args) {
        // Ternary operatoru YA sout icinde kullanilmali
        //                   YA DA mutlaka ATAMA yapilmalidir


        int a = 40;

        // a>0 ? a+10 : a-10 ;
        // sadece ternary olmaz


        // verilen gorevde hem yazdirma hem atama varsa
        // ternary yazarken dikkat edilmelidir


        int sayi = 15;

        // verilen sayi variable'inin degerini kontrol edip
        // sayi ciftse "cift sayilari sevmem" yazdirin
        // sayi tek ise sayinin degerini 10 artirin


        if (sayi%2==0){
            System.out.println("Çift Sayıları Sevmem");
        } else {
            sayi+=10;
        }
        System.out.println("Sayının Son Hali : " +sayi);

        // sayi%2==0 ? System.out.println("Cift sayi") : (sayi+=10) ;

        System.out.println(sayi%2 ==0? "Çift sayıları Sevmem" : "Sayının son durumu :" +(sayi +=10));
        System.out.println("Sayının son hali :" +sayi);



    }
}
