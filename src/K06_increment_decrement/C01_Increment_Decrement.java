package K06_increment_decrement;

public class C01_Increment_Decrement {
    public static void main(String[] args) {

        int sayi = 20;

        //Sayının değerini iki katına çıkarın

        //sayi = sayi *2;

        sayi *=2;
        System.out.println("12. Satırdaki sayı : " +sayi); //40


        //sayının değerinden 5 azaltın

        sayi -=5;
        System.out.println("18. satırdaki sayı değeri : " +sayi); //35

        //sayıı 5'e bölüp sonucu sayı variable'na atayın.

        sayi = sayi /5;

        System.out.println("23. Satırdaki sayı değeri : " +sayi); //7


        //sayı variable'ını değerini 1 artırın.

        sayi =sayi +1;

        System.out.println("30. satırdaki değeri : " +sayi); //8


        sayi +=1;

        System.out.println("35. satır değeri : " +sayi);

        sayi++;

        System.out.println("39. satır değeri : " +sayi);

        ++sayi;

        System.out.println("43. satır değeri : " +sayi);







    }
}
