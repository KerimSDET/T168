package Day04_forLoop;

public class C04_DikkatEdilmesiGerekenler {

    public static void main(String[] args) {


        //1.
        //10 ile 27 arasındaki negatif sayıalrı yazdırın

        for (int i = 10; i < 27; i++) {

            System.out.println(i+" için kontrol yapıldı.");
            if (i<0){

                System.out.println(i);
            }

        }

        for (int i = 10; i < 5; i++) {
            System.out.println(i); //java ilk değer olarka 10 değerini tama yaptı ve loop çalışmadan durdu

        }


    }
}
