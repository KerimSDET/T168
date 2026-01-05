package K08_ifElseStatements.D02_IfElseStatements;

import java.util.Scanner;

public class C01_EskenarUcgen {
    public static void main(String[] args) {


        //Soru 1: Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        //Üçgen eşkenar üçgen ise "Eşkenar Üçgen yazdırın,
        //Değilse "Eşkenar değil" yazdırın.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz : ");
        double kenar1 = scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar2>0){
            System.out.println("Eşkenar Üçgen");
        } else {
            System.out.println("Eşkenar üçgen değil");
        }

    }

}
