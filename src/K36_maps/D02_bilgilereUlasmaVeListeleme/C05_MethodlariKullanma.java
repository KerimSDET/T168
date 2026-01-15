package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Set;

public class C05_MethodlariKullanma {

    public static void main(String[] args) {
        OgrenciMap.numaradanOgrenciBilgisiYazdir(104);

        //104 numaralı öğrenci bilgileri :
        //10 H Ayse Can

        OgrenciMap.numaradanOgrenciBilgisiYazdir(106);
        //106 numaralı öğrenci bilgileri :
        //10 K Sevgi Can

        System.out.println();
        OgrenciMap.soyisimdenListeYAzdir("Cem");
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]
        //Soyismi : Cem olan öğrenciler :
        //10 K Veli Cem
        //11 K Ali Cem
        //11 M Sevgi Cem

        OgrenciMap.soyisimdenListeYAzdir("Can");
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]
        //
        //Soyismi : Can olan öğrenciler :
        //11 H Ali Can
        //10 H Ayse Can
        //10 K Sevgi Can

        /*
        sinif ve sube verildiginde
        o siniftaki ogrencilerin
        numara, isim, soyisimlerini liste olarak
        alt alta yazdiren bir METHOD olusturun

         */

        OgrenciMap.sinifSubeListesiYazdirma(10,"K");



    }
}
