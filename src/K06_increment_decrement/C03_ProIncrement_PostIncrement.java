package K06_increment_decrement;

public class C03_ProIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20;

        //a'nin değerini oluşturduğunuz bir b varaible'ina atayın.
        //sonra a'yi bir artırın.

        int b =a;
        a++;
        System.out.println("13. satırdaki a değeri : " +a + ", b'nin değeri : "+b);


        int c=20;

        //önce c'i bir artırın sonra 'nin değerini oluşturduğunuz bir d variableina atayın

        ++c;
        int d = c;

        System.out.println("c'nin değeri : " +c +" , d'nin değeri : " +d );


        //Aynı işlemleri ++ ile yapalım

        a=20;

        //a'nin değerini b varianle'ina atayın.
        //sonra 2'yi bir artıtın.

        b=a++; //yuarıdak 2 satır yerine tek satır kod


        System.out.println("34. satırdaki a değeri : " +a + ", b'nin değeri : "+b);

        c=20;

        //önce c ye bir artır
        //sonra c'nin değerini d'ye ata

        d=++c;

        System.out.println("c'nin değeri : " +c +" , d'nin değeri : " +d );









    }
}
