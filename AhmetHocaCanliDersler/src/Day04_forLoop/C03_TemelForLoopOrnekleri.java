package Day04_forLoop;

public class C03_TemelForLoopOrnekleri {
    public static void main(String[] args) {

        //675 den başlayarak geriye doğru 389a kadar sırnırlar dahill
        //17 ile bölünebilen sayıları yazdırın


        for (int i = 675; i >=389 ; i--) { //önce 675 dener sonra 674 hedef 389

            if (i%17==0){
                System.out.println(i+"");
            }

        }
        System.out.println("-------");

        //-10 ile +10 arasındaki tüm  tam sayıların çarpımını yazdırın

        int carpim =1;

        for (int i = -10; i <=10; i++) {

            carpim*=i;

        } System.out.println("Tüm çarpımları : "+carpim); //yanıt 0 çünkü arada sıfır rakam mı var

        //-10 ile +10 arasındaki sıfır hariç  tam sayıların çarpımını yazdırın

//        int carpim =1;
//
//        for (int i = -10; i!=0 && i<=10; i++) {
//
//            carpim*=i;
//
//        } System.out.println("Tüm çarpımları : "+carpim); //yanıt 0 çünkü arada sıfır rakam mı var



        //3 basamaklı 73 ile bölünebilen sayıları büyükten küçüğe göre yazdır



    }
}
