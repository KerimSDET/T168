package K08_ifElseStatements.D02_IfElseStatements;

import java.util.Scanner;

public class C03_BuyukHarfKontrolu {
    public static void main(String[] args) {

        //Soru : Kullanıcıdan bir karakter girmesini isteyin
        //girilen karakter büyük harf oluğ olmadığını yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char harf = scanner.next().charAt(0);

        //1. yöntem ascii table kullanarak

        if (harf>='A' && harf <='Z'){
            System.out.println("Girilen harf Büyük Harf'tir.");
        } else {
            System.out.println("Girilen harf küçük harftir.");
        }


        //2. yöntem character wrapper Class özelliklerini kullanalım

        if (Character.isUpperCase(harf)){
            System.out.println("Girilen harf Büyük harf");
        } else {
            System.out.println("Girilen harf küçük harf");
        }




    }
}
