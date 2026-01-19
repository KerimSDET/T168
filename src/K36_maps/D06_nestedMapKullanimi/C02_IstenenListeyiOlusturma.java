package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C02_IstenenListeyiOlusturma extends NestedOgrenciMap{


    public static void main(String[] args) {

        System.out.println(ogrenciNestedMapi);
        /*
        {
        102={bolum=Soz, isim=Veli, sinif=11, soyisim=Cem, sube=M},
        103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=H},
        104={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
        05={bolum=TM, isim=Sevgi, sinif=11, soyisim=Cem, sube=M},
        106={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
        107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M}}

         */
        mapeOgrenciEkleme(109,"Kerem Taner", "Tirpan", 3, "D","MF");
        mapeOgrenciEkleme(110,"Kerim", "Tirpan", 17, "D","EA");

        System.out.println(ogrenciNestedMapi);
        /*
        {
        102={bolum=Soz, isim=Veli, sinif=11, soyisim=Cem, sube=M},
        103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=H},
        04={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
        105={bolum=TM, isim=Sevgi, sinif=11, soyisim=Cem, sube=M},
        06={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
        107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M},
        109={bolum=MF, isim=Kerem Taner, sinif=3, soyisim=Tirpan, sube=D},
        110={bolum=EA, isim=Kerim, sinif=17, soyisim=Tirpan, sube=D}}
         */

        //103 numarli ogrencinin bolumunu MF yapin

        ogrenciNestedMapi.get(103).put("bolum", "MF");

        // 105 nolu ogrenci soyisim Yilmaz olsun

        ogrenciNestedMapi.get(105).put("soyisim","Yilmaz");

        System.out.println(ogrenciNestedMapi.get(103));

        System.out.println(ogrenciNestedMapi.get(105));


        //ogrenci mapindeki 11 sinifindaki ogrencilerin
        // numara, sinif, sube, isim ve soyisimlerini liste olarak yazdirin

        //1. adim tum keyleri bir set olarak kaydedin


        Set<Integer> ogrenciNoSet = ogrenciNestedMapi.keySet();
        System.out.println(ogrenciNoSet); //[102, 103, 104, 105, 106, 107, 109, 110]

        //2. adim ogrenci no setindeki nolari bir for each loop ile gozden gecirip
        // istenen sartlari saglayan ogrenciler icin istenen islmleri yapin

        for (Integer eachNum : ogrenciNoSet){
            if ((Integer)ogrenciNestedMapi.get(eachNum).get("sinif") == 11){
                System.out.println(
                        eachNum+ " "+
                        ogrenciNestedMapi.get(eachNum).get("sinif")+ " "+
                        ogrenciNestedMapi.get(eachNum).get("sube")+ " "+
                        ogrenciNestedMapi.get(eachNum).get("isim")+" "+
                        ogrenciNestedMapi.get(eachNum).get("soyisim")
                );
            }
        }




    }
}
