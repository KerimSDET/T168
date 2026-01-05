package K33_exceptions.D02_MultipleUncheckedExceptions;

public class C03_TekTryMultipleCatch {

    public static void main(String[] args) {

        String str = "Java Candır";
        int[] arr = {1,2,3,4,5,3,4,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        /*
        verilen negatif olmayan bir tamsayıyı index olarak kabul edip
        yukarıdaki str ve arr deki o index de bulunan harfi ve sayıyı yazdırın
        eğer kullanıcı index'den büyük sayı girerse
        hata mesajı ve son indexi yazdırın
         */

        int index = 8;

        if (index<0){
            System.out.println("Index negatif olmamalıdır.");
        } else {

            //2. yöntem : tek try multiple catch

            try {
                System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
                System.out.println(str.charAt(index)); //StringIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Girilen indez Array sınırları dışında.");

            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Girilen index Stringin sınırları dışındadır.");

            }


        } //else sonu
    }
}
