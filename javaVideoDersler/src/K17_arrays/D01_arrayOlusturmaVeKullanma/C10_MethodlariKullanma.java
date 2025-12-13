package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C10_MethodlariKullanma {

    public static void main(String[] args) {

//
//        int[] arr = {3,6,7,3,5,1};
//
//        arr = C05_TumElementleriArtirma.arryinElemanlariniARtir(arr, 4);
//
//
//        System.out.println(Arrays.toString(arr));
//
//
//
//        arr = C05_TumElementleriArtirma.arryinElemanlariniARtir(arr, 2);
//
//
//        System.out.println(Arrays.toString(arr));
//
//
//        System.out.println(C06_PozitifElementlerinToplami.pozitifElementlerinToplami(arr));
//
//
//        int[] kullaniciArr = C08_KullaniciArrayOlusturma.integerArrayOlustur();
//        System.out.println(Arrays.toString(kullaniciArr));


        String[] isimler = {"hamza","esra","serhat","kerem","kerem taner","yasemin","kerim","can"};

        int[] rakamlar ={2,44,666,8888,};

        String rakamlarString = Arrays.toString(rakamlar);


        C09_EnUzunVeEnKisaKelime.enKisaKelime(isimler);

        C09_EnUzunVeEnKisaKelime.getEnUzunKelime(isimler);


        System.out.println(C09_EnUzunVeEnKisaKelime.enKisaKelime1(isimler));

       // C09_EnUzunVeEnKisaKelime.enKisaKelime1(rakamlarString);

        System.out.println(rakamlarString);


//        System.out.println(Arrays.toString(enKisa));





//        String sonuc = C09_EnUzunVeEnKisaKelime.enKisaKelime(isimler);



    }
}
