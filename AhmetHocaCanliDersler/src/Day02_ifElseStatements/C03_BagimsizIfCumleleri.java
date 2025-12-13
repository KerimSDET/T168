package Day02_ifElseStatements;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a=20;
        int b=30;

        //Eğer a, b'den büyükse "a daha büyük" yazdırın


        if (a>b){
            System.out.println("a, b'den büyük");
        }

//        if (a<b) {
//            System.out.println("a, b'den küçük");
//        }


        //eğer a çift sayı ise "a çift sayıdır" yazıdırın

        if (a%2==0){
            System.out.println("a çift sayıdır.");
        }

    }
}
