package K12_forLoop.Ders02_nestedForLoop;

import java.util.Scanner;

public class Kerim_Elmas_Calismasi {


    public static void main(String[] args) {

//elmas şekli çizdirelim
        
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen elmasın yarı yükseklik sayısını giriniz : ");
        int satir = scanner.nextInt();

//        System.out.println("Lütfen sütun sayısını giriniz : ");
//        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir; i++) { //Satır sayısı  //üst kısım oldu

            //System.out.print(i);


            for (int s = 1; s <= satir - i; s++) { //boşluklar
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
            for (int i = satir-1; i >=1; i--) { //Satır sayısı alt kısım için

                //System.out.print(i);


                for (int s = 1; s <=satir-i; s++) { //boşluklar
                    System.out.print(" ");
                }

                for (int j = 1; j <=(i*2-1); j++) {
                    System.out.print("*");

                }

            System.out.println();

            } }}





