package K04_dataCasting;

public class C01_DataCasting_AutoWidening {

    static void main() {


        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5f;
        double dbl = 4.5;
        String str = "Java Candır";

        //int sayi2 = sayiInt;
        //int data turundeki bir degeri
        //yine int data turundeki bir variable'a atama yaparsak
        //bu data casting olmaz, ATAMA olur

        //bir variable'a başka data turundeki bir değer atanabilir mi?

//Aşağıdakiler atanamaz hata verir!!!!

//        bl = chr; //'a'
//        bl = byt; // 24
//        bl = shrt; //23
//        bl = sayiInt; //30
//        bl = str; //"Java Candır"

//        chr = bl; //true
//        chr = flt; //3.5f
//        chr = dbl; //4.5
//        chr = str; //"Java Candır"

//        str = bl; //true
//        str = byt; //24
//        str = chr; //'a'
//        str = shrt; //23
//        str = lng; //40

//        byt = shrt ; //23
//        byt = sayiInt; //30
//        byt = lng; //40
//        byt = flt; //3.5f
//        byt = dbl; //4.5

        shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

        sayiInt = byt;
        sayiInt = shrt;
//        sayiInt = lng ;
//        sayiInt = flt;
//        sayiInt = dbl;

        lng =byt;
        lng =shrt;
        lng =sayiInt;
//        lng = flt;
//        lng = dbl

        flt = byt;
        flt =shrt;
        flt =sayiInt;
        flt =lng;
//        flt =dbl;


        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng ;
        dbl = flt;

        //bir öndeki daha dar kapsamlı ise geniş kapsamlıya atanabiir
        //Buna Auto Widening deniyor.









    }
}
