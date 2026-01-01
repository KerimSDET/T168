package K24_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_FarkliZamanOlusturma {
    public static void main(String[] args) {

        LocalTime timeLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London : "+ timeLondon);

        LocalTime timeNetherlands = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println("Amsterdam : "+ timeNetherlands);

        LocalTime timeIstanbul = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Istanbul : "+ timeIstanbul);


    }

}
