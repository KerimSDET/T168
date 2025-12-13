package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C05_TumElementleriArtirma {

    public static void main(String[] args) {

        //verilen bir int arryinin
        //tüm elemanlarını 2 arttırın

        int[] arr ={3,7,0,2,4,6};


        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;
        }
        System.out.println(Arrays.toString(arr));




        //verilen bir int arrayin tüm elemanlarını
        //verilen sayı kadar artırıp bize
        //döndüren bir method oluşturun.
        //eski arrayi yeni haliyele kaydedin



    }

    public static int[] arryinElemanlariniARtir (int[] arr, int artisMiktari){
        for (int i = 0; i < arr.length ; i++) {

            arr[i]+=artisMiktari;

        }
        return arr;
    }
}
