package K36_maps.D05_nestedMapOlusturma;

import java.util.HashMap;
import java.util.Map;

public class C02_RezervasyonMapiOlusturma {

    public static void main(String[] args) {


         /*

           asagidaki rezervasyon'u bir map olarak olusturun


           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }

         */


        /*
        dikkate alacağımız hususlar:
        1-hangi bilgileri tutacagiz?
        2-Key ve Value'nun data türü ne olacak?
         */


        Map<String, String> bookingDatesValueMap = new HashMap<>(); //önce nested Mapi düzenledik. sonra yerine tanımladık
        bookingDatesValueMap.put("checkin", "2024-07-21");
        bookingDatesValueMap.put("checkout", "2024-08-10");


        Map<String, Object> reservationMap = new HashMap<>();

        reservationMap.put("firstname", "Ahmet");
        reservationMap.put("lastname", "Bulut");
        reservationMap.put("totalprice",500);
        reservationMap.put("depositpaid",false);
        reservationMap.put("bookingdates",bookingDatesValueMap); //nested Map yerine konuldu.
        reservationMap.put("additionalneeds","wi-fi");

        System.out.println(reservationMap);
        /*
        {  map olması sebebiyle sıralama ddeğişkendir.

         firstname=Ahmet,
         additionalneeds=wi-fi,
         bookingdates={
                      checkin=2024-07-21,
                      checkout=2024-08-10
                      },
         totalprice=500,
         depositpaid=false,
         lastname=Bulut
         }
         */
        System.out.println(reservationMap.get("firstname")); //Ahmet
        System.out.println(reservationMap.get("lastname")); //Bulut
        System.out.println(reservationMap.get("totalprice")); //5000
        System.out.println(reservationMap.get("depositpaid")); //false
        System.out.println(reservationMap.get("bookingdates")); //{checkin=2024-07-21, checkout=2024-08-10} nested farklı yola devam et. yazdir

        System.out.println(((Map<String, String>) reservationMap.get("bookingdates")).get("checkin"));
        System.out.println(((Map<String, String>) reservationMap.get("bookingdates")).get("checkout"));

        System.out.println(reservationMap.get("additionalneeds"));//wifi


        /*
            {
              firstname=Ahmet,
              additionalneeds=wi-fi,
              bookingdates=
                          {
                            checkin=2024-07-21,
                            checkout=2024-08-10
                            },
              totalprice=500,
              depositpaid=false,
              lastname=Bulut
              }
         */


        // totalprice 400'den dusuk ise "super", 400 veya daha fazla ise "pahali" yazdirin

        Integer totalPriceDegeri = (Integer) reservationMap.get("totalprice");
        if (totalPriceDegeri <400){
            System.out.println("Super");
        } else {
            System.out.println("Pahali");
        }
    }
}
