package K08_ifElseStatements.D01_bigimsizIfCumleleri;

import java.util.Scanner;

public class C02_EsKenarUcgenKontrolu {

    public static void main(String[] args) {



        //kullanıcıdan bri üçgenin kenar uzunuklarını alın
        //kenar uzunlukları birbirine eşi ise 1Eşkenar Üçgen" yazdırın.

        Scanner scanner =new Scanner(System.in);

        System.out.println("Üçgenin kenat uzunluklarını giriniz : ");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if (kenar1 == kenar2 && kenar1==kenar3 && kenar1>0){

            System.out.println("Eşkenar Üçgen");
        }

    }
}
