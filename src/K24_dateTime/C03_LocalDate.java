package K24_dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;

public class C03_LocalDate {
    public static void main(String[] args) {


        /*
            Localdate Class'i da LocalTime class'i ile benzer ozelliklere sahiptir

            - herhangi bir andaki local tarihi kaydedebiliriz
            - herhangi bir anda her hangi bir saat dilimideki(ZoneId) tarihi kaydedebiliriz
            - Verilen iki localDate arasindaki zaman dilimini bulabiliriz
            - localDate'den
                - get() ile tarihin istenen bolumu alinabilir
                - with() ile tarihin belirli bir bolumunu istenen deger ile degistirilebilir
                - plus() ile tarih istenen kadar ileri alinabilir
                - minus() ile tarih istenen kadar geri alinabilir
            - farkli tarihleri isAfter veya isBefore ile karsilastirabiliriz
         */

        //Japonyadaki şuandaki tarihi yazdırın

        LocalDate tarihJapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(tarihJapan);

        //Hawai deki tarih?

        LocalDate tarihHawai = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(tarihHawai);

        //02 Nisna 1983 için bir taih oluşturun
        LocalDate dogumtarihi = LocalDate.of(1983,04,02);
        System.out.println(dogumtarihi);

        // 02/04/1983 tarihinde doğan birinin şuan kaç yaşında olduğunu yazdırın
        System.out.println(Period.between(dogumtarihi, tarihHawai));


        //1900 yılının artık yıl olup olmadığını yazıdırın

        LocalDate yil1900 = LocalDate.of(1900,04,01);
        System.out.println(yil1900.isLeapYear());

        System.out.println(tarihHawai.getDayOfYear());


    }
}
