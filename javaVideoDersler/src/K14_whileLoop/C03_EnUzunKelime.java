package K14_whileLoop;

import java.util.Scanner;

public class C03_EnUzunKelime {

    public static void main(String[] args) {


        /*
        aşağıdaki görevi yapan bir method oluşturun:

        kullanıcıdan istediği kadar isim girmesini isteyin.
        kulanıcı işlemi bitirmek için Q'ya basmalıdır
        q veya Q olabilir
        girilen her ismin uzunluğunu kontrol edin ve
        işlem bitirildiğinde en çok harfe sahip olan
        en uzun! ismi yazdırın.
        eşit sayıda harfe sahip isimlerden herhangi biri olabilir
         */


        enUzunIsmiYazdir();





    }

    public static void enUzunIsmiYazdir(){
        Scanner scanner=new Scanner(System.in);

        String girilenIsim ="";
        String enUzunIsim="";
        while (!girilenIsim.equalsIgnoreCase("q")) {

            System.out.println("Lütfen en uzun ismi bulmak için bir isim giriniz,"+
            "\nbitirmek için Q'ya basınız..:");

            girilenIsim=scanner.nextLine();


            if (girilenIsim.length()>enUzunIsim.length()){
                enUzunIsim=girilenIsim;
            }

        } System.out.println("Girilen isimlerden en uzun olanı : "+enUzunIsim);
    }
}
