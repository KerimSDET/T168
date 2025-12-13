package Day03_stringManipulation;

public class C05_subString {
    public static void main(String[] args) {
        String str1 = "Bugün günlerden Salı";

        //verilen metnin belirli bir bölümünü almak için kullanılır.

        //kullanıcıdan ismini ve soyismini alın
        //ancak database'e kaydederken isim ve soyisimlerin
        //ilk harfleri büyük, sonraki harfler küçük olacak şekilde düzenleyip kaydedin.
        //KADİR YILMAZ, kadir yılmaz KADir YilmAZ ==> Kadir YILMAZ

        //kullanıcıdan ismini, soyismini ve kredi katı numarasını alın
        //ancak mektup yollarken bilgileri
        //ismin ve soyismin ilk harfleri büyük sonraki harfler * olacak şekilde düzenleyip yazdırın
        //kartın da son 4 hanesini gösterin diğerleri * olsun


        //Ayşe canan yılmaz kaya ==>Ayşe Canan Yılmaz Kaya şekinde düzenlemek gerekebilir

        System.out.println(str1.substring(2));

        System.out.println(str1.substring(10));

        System.out.println(str1.substring(5,14)); //başlangıç indeksini alır sonu almaz


        String str2 = "Java Güzeldir";
        System.out.println(str2.substring(2,str2.length()-5));



    }
}
