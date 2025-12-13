package K06_increment_decrement;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {


/*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa,
            ikisi de ayni islevi gorur, a'nin degerini bir artirirlar.

            ayni sekilde bir satirda sadece --a veya a-- varsa
            ayni islevi yapip a'yi bir azaltirlar.

            Farklari ++ ve -- kullanilan satirda
            baska bir islem daha yapilirsa ortaya cikar

            ++ veya -- 'nin diger islemden once mi sonra mi yapilacagina
            ++ veya -- 'nin variable'dan once veya sonra yazilmasina
            gore karar veririz.

            --a , ++b   ++ veya -- variable'dan once yazilmissa
                        once artirma veya azaltma yapilir, sonra diger islem yapilir

            a++ , b--   ++ veya -- variable'dan sonra yazilmissa
                        artirma veya azaltma sonra yapilir, once diger islem yapilir

         */


        int a = 20;
        int b = 40;

        a++;
        b--;

        System.out.println("36.satirda a : " + a + ", b : " + b); // 21 - 39


        ++a;
        --b;

        System.out.println("41.satirda a : " + a + ", b : " + b); // 22 - 38

        System.out.println(a++);
        System.out.println("45. Satırda a:" +a +" , b : " +b);

        System.out.println(++a);
        System.out.println("49.. satırda a: "+a+ " , b : " +b);

        System.out.println(b--);
        System.out.println("51. Satırda a:"+a+" , b: " +b);

        System.out.println(--b);
        System.out.println("54.satırda a : "+a+" , b : "+b);

        a=b++;

        System.out.println("57.satırda a : "+a+" , b : "+b);

        a=++b;

        System.out.println("61.satırda a : "+a+" , b : "+b);

        b=a++/2;

        System.out.println("65.satırda a : "+a+" , b : "+b);

        b=++a/2;

        System.out.println("69.satırda a : "+a+" , b : "+b);






    }
}
