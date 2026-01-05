package K11_StringManupulations.Ders03;

public class C07_lastIndexof {
    public static void main(String[] args) {

        String str ="ali topu tut, tut ali tut";

        // cümlede "tut" un ilk kullanım indexi nedir

        System.out.println(str.indexOf("tut"));


        // cümlede "tut" un 2. kullanım indexi nedir

        System.out.println(str.indexOf("tut",10));


        // cümlede "tut" un 3. kullanım indexi nedir
        System.out.println(str.indexOf("tut",15));



        //cumledeki en son tut indexi nedir

        System.out.println(str.lastIndexOf("tut"));
        // cümlede "ali" un ilk kullanım indexi nedir



        // cümlede "ali" nin ilk kullanım indexi nedir

        System.out.println(str.indexOf("ali"));

        // cümlede "ali" nin son kullanım indexi nedir

        System.out.println(str.lastIndexOf("ali"));


        // cümlede "tut" kelimesinin son kullanım indexi nedir

        System.out.println(str.lastIndexOf("tut"));

        // cümlede "tut" kelimesinin sondan bir önceki kullanım indexi nedir

        System.out.println(str.lastIndexOf("tut",21));

        // cümlede "tut" kelimesinin sondan üçüncğ önceki kullanım indexi nedir

        System.out.println(str.lastIndexOf("tut",13));


    }
}
