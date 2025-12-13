package Odev_01;

import java.util.Scanner;

public class S08_StrTerstenYazdirma {

    public static void main(String[] args) {


        /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen tersini yazmak için bir kelime giriniz :");
        String inputText= scanner.nextLine();

        String tersine = terstenYazma(inputText);
        System.out.println("Tersine yazınca : "+tersine);



    }

    public static String  terstenYazma (String str){

        String output ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            output+=str.charAt(i);

        }
        return output;


    }
}
