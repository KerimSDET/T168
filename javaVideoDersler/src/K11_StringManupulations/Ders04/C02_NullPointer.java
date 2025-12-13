package K11_StringManupulations.Ders04;

public class C02_NullPointer {
    public static void main(String[] args) {
        String isim1 = "";
        String isim2;
        String isim3 = null;


        //isim1 is yazdırın
        System.out.println(isim1); //java ne olduğuna bakmaz sonuçta hiçlik atanmış.

        //isim1 in length'ini yazdırın
        System.out.println(isim1.length());

        //isim1 is yazdırın
        //System.out.println(isim2); yazdırmaz değer atanmadığı için

        //isim1 in length'ini yazdırın
        //System.out.println(isim2.length());

        //isim1 is yazdırın
        System.out.println(isim3); //yazdırır ama başka işlem yapılmaz

        //isim1 in length'ini yazdırın
        //System.out.println(isim3.length()); //bunu çalıştırmaz yazdırmaz

    }
}
