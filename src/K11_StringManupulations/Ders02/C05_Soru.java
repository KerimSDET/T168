package K11_StringManupulations.Ders02;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        //kullanıcıdan bir metin isteyin
        //metin ev içeriyorsa ev gibisi var mı?
        //metin iş içeriyorsa çalışma ne güzel
        //hem ev hem iş içeriyorsa evden çalışmak gibisi yok
        //bunarı içermiyorsa çok çalışmak lazım çook yazıdırn


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz :");
        String metin = scanner.nextLine().toLowerCase();

        if (metin.contains("ev") && metin.contains("iş")) {
            System.out.println("Evden çalışmak gibisi yok");
        } else if (metin.contains("iş")) {
            System.out.println("Çalışmak ne güzel");
        } else if (metin.contains("ev")){
            System.out.println("Ev gibisi var mı?");
        } else
            System.out.println("Çok çalışmaak lazım , çook..");
    }
}
