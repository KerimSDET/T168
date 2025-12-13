package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullaniciArrayOlusturma {

    public static void main(String[] args) {
        //Kullanıcıdan array'in boyutunu ve Integer elementlerini alıp
        //array'i oluşturun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Array element sayısını (boyutunu) belirtiniz :");
        int arrayBoyutu = scanner.nextInt();

        int[] arr = new int[arrayBoyutu];


        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array için bir tamsayı belirtiniz :");
            arr[i] = scanner.nextInt();

        }


        System.out.println(Arrays.toString(arr));


    }

    //Kullıcıdan array'in boyutunu ve Integer elementlerini alıp
    //array'i oluşturan ve bize döndüren bir method oluşturun

    public static int[] integerArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Array element sayısını (boyutunu) belirtiniz :");
        int arrayBoyutu = scanner.nextInt();

        int[] arr = new int[arrayBoyutu];


        for(int i = 0;i<arr.length;i++){

            System.out.println("Array için bir tamsayı belirtiniz :");
            arr[i] = scanner.nextInt();

        } return arr;

     }
}


