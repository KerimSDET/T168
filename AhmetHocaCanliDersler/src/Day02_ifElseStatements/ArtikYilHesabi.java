package Day02_ifElseStatements;

import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        int year = scanner.nextInt();

        if ((year%4==0) || (year%100!=0) && year%400==0){
            System.out.println(year + " bir artık yıldır");
        } else System.out.println(year + " bir artık yıl DEĞİLDİR");



    }
}
