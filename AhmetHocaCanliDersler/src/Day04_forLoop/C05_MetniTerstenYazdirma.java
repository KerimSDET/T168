package Day04_forLoop;


import java.util.Scanner;

public class C05_MetniTerstenYazdirma {

    //Kullanıcıdan bir String insteyin ve bunu tersrten yazdırın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metni giriniz:" );
        String metni =scanner.nextLine();


        //Ali topu at
        for (int i = metni.length()-1; i >=0 ; i--) {
            System.out.print(metni.charAt(i));

        }

    }
}
