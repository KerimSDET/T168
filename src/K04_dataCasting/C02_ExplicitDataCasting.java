package K04_dataCasting;

public class C02_ExplicitDataCasting {

    static void main() {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        // bir variable'a kendisinden daha genis data turundeki bir deger ATANABILIR MI?


        byt = (byte)shrt; // 23
        byt = (byte)sayiInt; // 30
        byt = (byte)lng; // 40
        byt = (byte)flt; // 3.5
        byt = (byte)dbl; // 4.5

        shrt = byt;
        shrt = (short)sayiInt;
        shrt = (short)lng;
        shrt = (short)flt;
        shrt = (short)dbl;

        sayiInt = byt;
        sayiInt = shrt;
        sayiInt = (int)lng;
        sayiInt = (int)flt;
        sayiInt = (int)dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
        lng = (long)flt;
        lng = (long) dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
        flt = (float) dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        // Sayi degeri alan byte, short, int, long, float ve double variable'lar ise
        // variable'in data turunden daha genis kapsamli olan data turundeki degerleri
        // atamak istedigimizde sorumlulugu almamiz gerekir
        // degerin onune () icerisinde cevirmek istedigimiz data turunu yazabiliriz
        // buna Explicit narrowing(zorlayarak daraltma) denir

//                 bl = (boolean) chr;
//                 bl = (boolean) byt;
//                 bl = (boolean) sayiInt;
//                 bl = (boolean) sayiInt;
//                 bl = (boolean) str;

//                 str = (String) bl;
//                 str = (String) bl;
//                 str = (String) chr;
//                 str = (String) shrt;
//                 str = (String) lng;

        // boolean veya String data turundeki bir variable'a
        // baska data turundeki degerleri Cast Edemeyiz
    }
}
