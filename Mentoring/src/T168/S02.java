package T168;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {

//        Kullanıcıdan bir kelime isteyin.
//        Bu kelimenin her harfini ayrı satırda for döngüsüyle yazdırın.
//
//        Eğer kelimenin içinde r harfi varsa → "Bu kelimede R harfi var."
//
//        Yoksa → "Bu kelimede R harfi yok."


        Scanner scanner1=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz :");
        String kelime = scanner1.next();




        for (int i = 0; i < kelime.length() ; i++) {

            //char harf =kelime.charAt(i);

            String harf =kelime.substring(i,i+1);

            System.out.println(harf);

            }


        if (kelime.contains("r")) {
            System.out.println(" Bu kelimede R harfi var.");
        }

        else {
            System.out.println(" Bu kelimede R harfi yok.");

        }

        }

    }

