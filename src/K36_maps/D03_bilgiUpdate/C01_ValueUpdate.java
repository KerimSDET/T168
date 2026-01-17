package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Arrays;

public class C01_ValueUpdate extends OgrenciMap {
    public static void main(String[] args) {

        //102 nuamralı öğrencinin ismini ve soyismini yazdırın

        String ogrenciValue = ogrenciMap.get(102);
        System.out.println(ogrenciValue);

        String[] ogrenciValuArr = ogrenciValue.split("-");

        System.out.println(Arrays.toString(ogrenciValuArr));

        System.out.println("102 numaralı öğrenci : "+ogrenciValuArr[0]+" "+ogrenciValuArr[1]+" "+ogrenciValuArr[2]);
        //102 numaralı öğrenci : Veli Cem 10

        //102 numarlı örencinin adını Kemal olarak update ediniz

        ogrenciValuArr[0] = "Kemal";

        System.out.println(Arrays.toString(ogrenciValuArr));

        // Map'de update yapmak için arry'in yeni halini - ile birleştirip
        //yeni value elde edelim.

        String yeniValue = String.join("-", ogrenciValuArr);

        System.out.println(yeniValue);
        ogrenciMap.replace(102,yeniValue);

        System.out.println(ogrenciMap);

        /*
        104 numarlaı öğrencinin soyismini Yılmaz yapın
        1- ogrencinin eski value'sunu kaydedelim.
        2- bilgilere rahat ulaşabilmek için value'yu split edelim
        3- array üzerindeki istenen kontrolleri ve update i yapın
        4-update array'de yapıldı, bu degisiklik map'e ypabilmek icin
        arrayi yeniden - ile birlestirip yeniValue elde edelim
        key belli, yeniValue de oluşturuldu, ikisini kullanarak mapi update edelim
         */

        int verilenNo = 104; // 104 numarlaı öğrencinin soyismini Yılmaz yapın
        String yeniSoyisim = "Yilmaz";

        String verilenNoValue = ogrenciMap.get(verilenNo); //1- ogrencinin eski value'sunu kaydedelim.

        String[] verilenNoArr = verilenNoValue.split("-");  //2- bilgilere rahat ulaşabilmek için value'yu split edelim

        verilenNoArr[1] = yeniSoyisim;  //3- array üzerindeki istenen kontrolleri ve update i yapın ama arrayde

        String verilenNoYeniValue = String.join("-", verilenNoArr); //arrayi yeniden - ile birlestirip yeniValue elde edelim

        ogrenciMap.replace(verilenNo,verilenNoYeniValue); //key belli, yeniValue de oluşturuldu, ikisini kullanarak mapi update edelim


        System.out.println(ogrenciMap);

    }
}
