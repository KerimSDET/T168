package K23_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_mutable_immutableClasses {
    public static void main(String[] args) {


        String str = "Java Candır";

        //immutable class'larda methodlarla yapılan değişiklikler KALICI OLMAZ

        str.toUpperCase();

        System.out.println(str.substring(2));

        System.out.println(str);


        List<String > isimler = new ArrayList<>(Arrays.asList("Cansu", "Asuman", "Hamza"));

        //mutable classlarda methodlarla yapılan değişiklikler KALICI OLUR

        System.out.println(isimler);

        isimler.add("Kerem");

        System.out.println(isimler);

        isimler.remove(0);

        System.out.println(isimler);

    }

   // public static String isimler ();

}
