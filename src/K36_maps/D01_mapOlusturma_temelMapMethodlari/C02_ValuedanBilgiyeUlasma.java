package K36_maps.D01_mapOlusturma_temelMapMethodlari;

import java.util.Arrays;

public class C02_ValuedanBilgiyeUlasma {

    public static void main(String[] args) {

        // bir ogrencinin bilgileri tek bir String halinde
        // asagida verilen formatla tutulmaktadir
        // ogrenci bilgisi verildiginde soyismi yazdirin

        String ogrenciBilgisi = "Ali-Can-11-H-MF";

        //ogrenci bilgisi verildiginde sinifi yazdirin

        String [] valueArr = ogrenciBilgisi.split("-");
        System.out.println(Arrays.toString(valueArr)); //[Ali, Can, 11, H, MF]

        //ogrencinin sinif ve bolumunu yazdirin
        System.out.println("Sinif : "+ valueArr[2]);
        System.out.println("Bölüm : "+ valueArr[4]);

        //Ogrenci isim ve soyismini yazdirin
        System.out.println("isim soyisim : "+ valueArr[0]+" "+valueArr[1]);     //isim soyisim : Ali Can




    }
}
