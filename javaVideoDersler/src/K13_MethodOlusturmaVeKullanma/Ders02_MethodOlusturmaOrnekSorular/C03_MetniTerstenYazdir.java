package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C03_MetniTerstenYazdir {
    public static void main(String[] args) {
        //verilen metni tersten yazdıran bri method oluşturun.

        metniTerstenYazdir("Java bu işi çözmüş");

    }

    public static void metniTerstenYazdir(String isim){
        for (int i = isim.length()-1; i >=0; i--) {
            System.out.print(isim.charAt(i));
        }
    }
}
