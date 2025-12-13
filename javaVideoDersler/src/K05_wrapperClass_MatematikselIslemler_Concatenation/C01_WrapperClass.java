package K05_wrapperClass_MatematikselIslemler_Concatenation;

public class C01_WrapperClass {

    public static void main(String[] args) {
        String str = "Java Candır";

        int sayi = 34;

        System.out.println(str.toUpperCase()); //JAVA CANDIR
        System.out.println(str.charAt(2)); //v

        //Java primitive data türlerinde bazı hazır method'ları kullanabilmemiz için
        //Wrapper CLASS'ları oluşturmuştur.
        //boolean, char , byte , short, int , long, float, double
        //Boolean, Character, Byte, Short, Integer, Long, Float, Double


        int sayi1 = 5 ;
        Integer sai2 = sayi1 ;

        Integer sayi3 = 3456;
        int sayi4 = sayi3;



        //primitive variable'lar ile aynı data türündenwrapper class'ndaki
        // variable'lar arasında geçiş yapmak mümkündür.
        //Amma farklı wrapper class'lar arasında geçiş mümkün değildir.!!!
        //Aynı şekilde Wrapper Class'dan oluşturulan bşr varşable'a başka isimdeki primitive data türündeki
        //değei de ATAYAMAYIZ

        int sayi5 = 25;
        short sayi6 = 45;
        byte sayi7 = 23;

        int sayi8 = sayi6; //int<==shorta atamak istiyorum.
        sayi6 = sayi7; //short <==byte küçük kova büyük kovaya atanabilir. byte shorttan küçük

        Short sayi9 = 45;
        //Integer sayi10 = sayi9; //java bunu kabul etmez. Integer türe short atamak istiyoruz burada
        // "java: incompatible types: java.lang.Short cannot be converted to java.lang.Integer"

        //Integer sayi11 = sayi6; //Integer türe short atanamaz.

        String fiyat1 = "23";
        String fiyat2 = "45";

        //String olarak verilen iki ürünün fiyatını topayın

        System.out.println(fiyat1+fiyat2);

        //İçinde SADEECE sayılar olduğundan emin olduğumuz Stringleri
        //Wrapper Class'ları kullanarak sayıya çevirebiliriz.

        int fiy1 = Integer.parseInt(fiyat1);
        int fiy2 = Integer.valueOf(fiyat2);

        System.out.println("Fiyatların Toplamı : "  + (fiy1 + fiy2));

        fiyat1 = "23.45" ;
        fiyat2 = "34.43" ;

        double f1 = Double.parseDouble(fiyat1);
        double f2 = Double.valueOf(fiyat2) ;

        System.out.println("Fiyatların Toplamı : " + (f1 +f2)); //57.88

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //kullanıdan bir karakter alıp
        char harf ='s';


        //verilen karakterin Büyük Harf olup olmasığını yazdırın

        System.out.println(Character.isUpperCase(harf)); //false


        //verilen karakterin Küçük Harf olup olmadığını yazdırın

        System.out.println(Character.isLowerCase(harf)); //true

        //verien karakterin Sayi olup olmaduğını yazdırın.

        System.out.println(Character.isDigit(harf)); //false

        //verilen karakterin Harf olup olmadığını yazıdırın.

        System.out.println(Character.isLetter(harf)); //true

        //verilen karakterin Alfabetik olup olmadığını yazdırın.

        System.out.println(Character.isAlphabetic(harf)); //true

        //verilen karakteri Büyük harf yazdırın

        System.out.println(Character.toUpperCase(harf)); //S




    }
}
