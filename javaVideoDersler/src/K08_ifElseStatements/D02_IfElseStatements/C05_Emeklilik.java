package K08_ifElseStatements.D02_IfElseStatements;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {

        //Kullanıcıdan yaşını isteyin
        // 65 yaş ve üzeri ise  "Emekli olabilirsin". yazdırın
        //yoksa emekli olması için çalışması gerekn bir yıl sayısı yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        double yas = scanner.nextDouble();

        if (yas>=65) {
            System.out.println("Emekli Olabilirsin");
        } else {
            System.out.println("Emekli olabilmen için daha " + (65-yas)+ " yıl çalışmalısın");

        }

    }
}
