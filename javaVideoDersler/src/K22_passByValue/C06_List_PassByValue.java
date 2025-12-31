package K22_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu","Dilan","Bahadır","Maya","Kerem"));


        /*
        verilen bir isim listesini parametre olarak alıp
        kullanıcdan bir isim alıp listeye ekleyen
        ve listenin yeni hakini yazdıran bir method oluşturun
         */


        birIsımEkle(isimler);  //

        System.out.println("Main methodda liste : " + isimler);     //Listeye bir isim ekledim : [Cansu, Dilan, Bahadır, Maya, Kerem,  Kerim]
                                                                    //Main methodda liste : [Cansu, Dilan, Bahadır, Maya, Kerem,  Kerim]


/*
verilen bir lsiteye kullanıcıdan bir isim alıp listeye ekle ve listenin son hakini yazdıran bir method oluştur
 */

        yeniListeOlustur(isimler);

        System.out.println(isimler);



    }

    public static void birIsımEkle (List<String> isimler){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz :");
        String isim = scanner.nextLine();

        isimler.add(isim);

        System.out.println("Listeye bir isim ekledim : "+ isimler);

    }

    public static void yeniListeOlustur(List<String> isimler){

        isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz :");
        String isim = scanner.nextLine();

        isimler.add(isim);

        System.out.println("yeni oluşturduğum Listeye yeni bir isim ekledim : "+ isimler);


    }

}
