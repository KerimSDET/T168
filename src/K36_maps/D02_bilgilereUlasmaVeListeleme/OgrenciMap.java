package K36_maps.D02_bilgilereUlasmaVeListeleme;



import java.util.*;

public class OgrenciMap {

    public static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    /*
        Öğrenci map'inde verilen öğrenci noya sahip
        sınıf, şube, isim ve soyismini yazdırın
         */

    public static void numaradanOgrenciBilgisiYazdir (int ogrenciNo){


        //1- ogrenci value'yu kaydedelim

        String ogranciValue =ogrenciMap.get(ogrenciNo); //Ali-Cem-11-K-TM

        //2- bilgilere rahat ulaşabilmek için value'yu Array'e split edelim

        String[] valueArr = ogranciValue.split("-");

        //3- bu aşamada Array'de isttenilen bilgileri alabiliriz.

        System.out.println(ogrenciNo+" numaralı öğrenci bilgileri : ");

        System.out.println(
                valueArr[2] + " " + valueArr[3] + " " + valueArr[0]+" "+ valueArr[1]
        );

    }
    /*
            verilen soyisim'e sahip öğrencilerin
            sınıf şube isim ve soyisimlerini
            alt alta yazdırın
             */
    public static void soyisimdenListeYAzdir (String verilenSoyisim) {
        Collection<String> ogrenciVeluleriCollection =ogrenciMap.values(); //valuleri kaydettik ama ham daha

        System.out.println(ogrenciVeluleriCollection);

        System.out.println();

        System.out.println("Soyismi : "+verilenSoyisim+" olan öğrenciler :");

        for (String each: ogrenciVeluleriCollection){ //ham value değerini liste hale getirdik.
            //System.out.println(each);
            String[] valueArr = each.split("-");

            if (valueArr[1].equalsIgnoreCase(verilenSoyisim)){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }

        }
        System.out.println();
    }


    public static void sinifSubeListesiYazdirma (Integer istenenSinif, String sube ){

//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeyseti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim
        //ogrenciKeyseti .forEach(System.out::println);
        System.out.println(istenenSinif+"/"+sube+" subesindeki ogrenci listesi :");

        for (Integer key : ogrenciKeyseti) {

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue =ogrenciMap.get(key);

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArray = eachValue.split("-");

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin


//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir

//        Collection<Integer> ogrenciKeySet =ogrenciMap.keySet();
//        ogrenciKeySet.forEach(System.out::println);
//        String eachKeySetValue = ogrenciMap.get(ogrenciKeySet);
//
//        Collection<String>  ogrenciValueDegerleri = ogrenciMap.values();
//        ogrenciValueDegerleri.forEach(System.out::println);


            if (eachValueArray[2].equalsIgnoreCase(istenenSinif+"")
                    && eachValueArray[3].equalsIgnoreCase(sube)) {

                System.out.println(
                        key+ " "+eachValueArray[0]+" "+eachValueArray[1]+""
                );

            }

        }
    }

    public static void isimdenOgrenciListele(String verilenIsım) {
        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();


        //            2- bir for-each loop ile her bir key'i ele alalim


        System.out.println("Ismi " + verilenIsım + " olan öğrencilerin listesi");
        for (Integer each : ogrenciKeySet) {
            //            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(each);


            //ogrenciKeyseti .forEach(System.out::println);


            //            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim

            String[] eachValueArr = eachValue.split("-");


            //            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(verilenIsım)) {
                //numara sinif sube isim ve soyisimlerini yazdirin
                System.out.println(
                        each + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3] + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1]
                );
            }
        }
    }

    public static void numaraIleSoyIsımUpdate (int verilenNo, String yeniSoyisim){
        String verilenNoValue = ogrenciMap.get(verilenNo); //1- ogrencinin eski value'sunu kaydedelim.

        String[] verilenNoArr = verilenNoValue.split("-");  //2- bilgilere rahat ulaşabilmek için value'yu split edelim

        verilenNoArr[1] = yeniSoyisim;  //3- array üzerindeki istenen kontrolleri ve update i yapın ama arrayde

        String verilenNoYeniValue = String.join("-", verilenNoArr); //arrayi yeniden - ile birlestirip yeniValue elde edelim

        ogrenciMap.replace(verilenNo,verilenNoYeniValue); //key belli, yeniValue de oluşturuldu, ikisini kullanarak mapi update edelim
    }

    public static void kullanicidanAlinanBilgilerleOgrenciEkle (){

        Scanner scanner =   new Scanner(System.in);

        System.out.println("öğrenci no girin");
        int ogrenciNo = scanner.nextInt();

        String ogrenciValue ="";

        scanner.nextLine();
        System.out.println("Isim ?");
        ogrenciValue+= scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("Soyisim ?");
        ogrenciValue+= scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("sinif ?");
        ogrenciValue+= scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("sube ?");
        ogrenciValue+= scanner.nextLine().toUpperCase();
        ogrenciValue+="-";

        System.out.println("bolum ?");
        ogrenciValue+= scanner.nextLine().toUpperCase();
        ogrenciValue+="-";

        ogrenciMap.put(ogrenciNo,ogrenciValue);




    }

    public static void subeUpdate (Integer sinif, String eskiSube, String yeniSube){
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        //bir for each loop ile her bir key'i ele alalım

        for (Integer key : ogrenciKeySeti) {

            //bizim oglanin getirdiği key'e ait value'yu kaydedelim

            String eachValue = ogrenciMap.get(key);

            //Value'yu split ile bolup
            //bir array olarka kaydedelim ki bilgilere direk ulaşabilelim

            String[] eachValueArr = eachValue.split("-");

            //kaydettiğimiz valueArr'sinde istenen bilgiyi kontrol edip
            //istenen şartı sağlayan ogrencilerin istenen bilgilerini update edip
            //10 K sinifindaki ogrencikerin subesini Z yapalim

            if (eachValueArr[2].equalsIgnoreCase(sinif+"") && eachValueArr[3].equalsIgnoreCase(eskiSube)) {
                eachValueArr[3] = yeniSube;
            }

            //bu değişiklik arrayde yapıldı bunu mape yüklemek için birleştirme yap

            String yeniValue = String.join("-", eachValueArr);

            //key ve yeniValue değeerini mape update edelim

            ogrenciMap.put(key,yeniValue);

        }
    }

    public static void bolumUpdate (String eskiBolum, String yeniBolum){

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        //bir for each loop ile her bir key'i ele alalım

        for (Integer key : ogrenciKeySeti) {

            //bizim oglanin getirdiği key'e ait value'yu kaydedelim

            String eachValue = ogrenciMap.get(key);

            //Value'yu split ile bolup
            //bir array olarka kaydedelim ki bilgilere direk ulaşabilelim

            String[] eachValueArr = eachValue.split("-");

            //kaydettiğimiz valueArr'sinde istenen bilgiyi kontrol edip
            //istenen şartı sağlayan ogrencilerin istenen bilgilerini update edip
            //10 K sinifindaki ogrencikerin subesini Z yapalim

           if (eachValueArr[4].equalsIgnoreCase(eskiBolum)){
               eachValueArr[4] = yeniBolum;
           }

            //bu değişiklik arrayde yapıldı bunu mape yüklemek için birleştirme yap

            String yeniValue = String.join("-", eachValueArr);

            //key ve yeniValue değeerini mape update edelim

            ogrenciMap.put(key,yeniValue);

        }
    }

    public static void yilSonuSinifArtirma () {
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        //bir for each loop ile her bir key'i ele alalım

        for (Integer key : ogrenciKeySeti) {

            //bizim oglanin getirdiği key'e ait value'yu kaydedelim

            String eachValue = ogrenciMap.get(key);

            //Value'yu split ile bolup
            //bir array olarka kaydedelim ki bilgilere direk ulaşabilelim

            String[] eachValueArr = eachValue.split("-");

            //kaydettiğimiz valueArr'sinde istenen bilgiyi kontrol edip
            //istenen şartı sağlayan ogrencilerin istenen bilgilerini update edip
            //10 K sinifindaki ogrencikerin subesini Z yapalim

            String eskiSinif = eachValueArr[2];

            //bir switch oluşturuyoruz
            switch (eskiSinif) {
                case "9":
                    eachValueArr[2] = "10";
                    break;
                case "10":
                    eachValueArr[2] = "11";
                    break;
                case "11":
                    eachValueArr[2] = "12";
                    break;
                case "12":
                    eachValueArr[2] = "Mezun";


            }


            //bu değişiklik arrayde yapıldı bunu mape yüklemek için birleştirme yap

            String yeniValue = String.join("-", eachValueArr);

            //key ve yeniValue değeerini mape update edelim

            ogrenciMap.put(key, yeniValue);
        }

    }

}



