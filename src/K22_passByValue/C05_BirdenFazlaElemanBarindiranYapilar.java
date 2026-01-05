package K22_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C05_BirdenFazlaElemanBarindiranYapilar {

    public static void main(String[] args) {

        int[] arr = {3,5,6};

        arr[1] =8; //elemnetlerden birinin yerine atama var.

        System.out.println(Arrays.toString(arr)); //[3, 8, 6] oldu


        int[] yeniArr = {2,5,7};

        arr = yeniArr; // arr'nin kendisine atama var

        System.out.println(Arrays.toString(arr)); //[2, 5, 7] oldular

        //array'in elementlerini birer artırıp son halini yazdıran bir method oluşturun.

        elementleriBirArtir(arr); //[3, 6, 8]

        System.out.println("Main method'da arr : " + Arrays.toString(arr));

        elementleriBirArtir(arr); //[3, 6, 8]

        System.out.println("Main method'da arr : " + Arrays.toString(arr));


        //array'e 5 uzunluğunda ve içnde 100'den küçük rastgele pozitif sayilar bulunan
        //yeni bir array atayıp arry'i yazdıran method oluşturun

        yeniArrAta(arr); // Yeni arr atadım : [31, 49, 85, 47, 24]

        System.out.println(Arrays.toString(arr));


    }

    public static void elementleriBirArtir(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i] +=1;

        }
        System.out.println("Elemanları artırdım : "+Arrays.toString(arr));

    }

    public static void yeniArrAta(int[] arr){

        int[] yeniArr = new int[5];

        Random random = new Random();

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = random.nextInt(100);
            
        }

        arr = yeniArr;

        System.out.println("Yeni arr atadım : "  + Arrays.toString(arr));

    }


}
