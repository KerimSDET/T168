package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C09_EnUzunVeEnKisaKelime {

    public static void main(String[] args) {

        //verilen String bir array'deki
        //en uzun ve en kısa kelimeleri yazdırın


        String[] isimler = {"hamza","esra","serhat","kerem","kerem taner","yasemin","kerim","can"};


        String enUzunKelime =isimler[0];
        String enKisaKelime =isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }

            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }

        }

        System.out.println("En kısa kelime : "+enKisaKelime);
        System.out.println("En uzun kelime : "+ enUzunKelime);

    }

    //verilen String bir array'deki
    //en uzun ve en kısa kelimeleri yazdıran bir method oluşturun


    public static void enKisaKelime(String[] arr){

        String enKisa =arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }
        }

        System.out.println(enKisa);

    }

    public static void getEnUzunKelime(String[] arr) {

        String enUzun =arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }
        }

        System.out.println(enUzun);

    }

    public static String enKisaKelime1(String[] arr){

        String enKisa =arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }
        }

        return enKisa;

    }


    public static void enKisaEnUzunKelimeYazdir(String[] kelimeler) {

    }
}
