package K36_maps.D02_bilgilereUlasmaVeListeleme;

public class C01_NumaraIleOgrenciArama extends OgrenciMap{

    public static void main(String[] args) {
        /*
        Öğrenci map'inde verilen öğrenci noya sahip
        sınıf, şube, isim ve soyismini yazdırın
         */

        int ogrenciNo = 105;
        System.out.println(ogrenciMap);
        //mapeOgrenciEkle();
        System.out.println(ogrenciMap);
        /*
        {}

        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}

         */

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
}
