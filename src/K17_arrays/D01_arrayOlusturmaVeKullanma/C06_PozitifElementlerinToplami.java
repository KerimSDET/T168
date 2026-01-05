package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C06_PozitifElementlerinToplami {

    public static void main(String[] args) {


        //verilen bir array'deki pozitif tamsayıların toplamını yazdırın

        int[] arr = {-4, -6, 7, 2, 5, -1, 0, 4, -5, 3};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }

        }
        System.out.println("Pozitif sayılar toplamı : " + toplam);


    }

    //verilen bir arraydeki pozitif tamsayıları toplayıp sonucu bize döndüren bir method yazınız.

    public static int pozitifElementlerinToplami(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }

        }return toplam;
    }
}

