package K24_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        //bilgisayarınızdaki zamanı yazdırın

        LocalTime saat = LocalTime.now();

        /*
            Time ve date ile ilgili objeler olustururken
            Java sifirdan bir obje olusturmamiza izin vermez
            zamani ve tarihi bilgisayarimizdan alacagi icin bazi on ayarlari yapmasi gerekir

            Java kendisi bize tarihi veya zamani return edecek
            method'lar hazirlamistir

            biz de class'imizda zaman veya tarih objesi olusturdugumuzda
            degeri o method'lardan alip kullaniriz
         */

        System.out.println(saat);

        //.get..() localTime değerindeki saat, dakika, saniye veya nanosaniyeyi bize getirir.

        System.out.println(saat.getHour());


        //Bir loop oluşturun
        //Loop'un çalışmaya başladığı maan ile bittiği zman arasındaki farkı bulun
        

        LocalTime baslangis =LocalTime.now();
        String str ="";

        for (int i = 0; i < 100000; i++) {

            str+=i;
            
        }

        LocalTime bitis = LocalTime.now();

        System.out.println("Saat : "+saat);
        System.out.println("Baslangıç : "+baslangis);
        System.out.println("Bitiş : "+bitis);

         /*
            LocalTime class'i obje olusturdugumuz satir calistiginda
            calistigi sistemdeki zaman bilgisini alir

            olusturulan localTime objesi bir kronometre degil
            olusturuldugu andaki degeri saklayan basit bir variable'dir

            Eger koddaki 2 satirin calismasi arasinda gecen zamani bulmak isterseniz
            o iki satirda 2 adet localTime objesi olusturup
            bu zamanlar arasindaki farki bulmaliyiz

         */

        // 1- get method'lari ile zaman arasindaki farki bulabiliriz

        System.out.println(bitis.getSecond() - baslangis.getSecond());


        //2- Deration between() ile başlangıc ve bitiş değerleini bulabiliriz.

        System.out.println("Duration ile :"+Duration.between(baslangis, bitis));

        //3- toSecondOfDay() veya toNanoOfDay() ile arasındaki farkı bulabiliriz.

        System.out.println(baslangis.toSecondOfDay());
        System.out.println(baslangis.toNanoOfDay());

        System.out.println(bitis.toNanoOfDay() - baslangis.toNanoOfDay());

        System.out.println(saat.withHour(10));
        System.out.println(saat.withSecond(0).withNano(0));

        System.out.println(saat.plusHours(7).plusMinutes(12).plusSeconds(10));

        System.out.println(saat.isBefore(baslangis));
        System.out.println(saat.isAfter(baslangis));
        System.out.println(saat.isAfter(bitis));

    }
}
