package K36_maps.D08_treeMapMethodlari;


import java.util.TreeMap;

public class C02_TreeMapMethodlari {


    public static void main(String[] args) {


        TreeMap<String,Integer> harflerMap = new TreeMap<>();
        harflerMap.put("D",11);
        harflerMap.put("P",22);
        harflerMap.put("S",33);
        harflerMap.put("F",14);
        harflerMap.put("O",5);

        TreeMap<String,Integer> harflerMap2 = new TreeMap<>();

        //TreeMap DOGAL SIRALI oldugunda bir elemanin sirada onundakiler veya arkasindakilar ile ilgili
        //pek cok method vardir.

        System.out.println(harflerMap); //{D=11, F=14, O=5, P=22, S=33}
        System.out.println(harflerMap2); //{}


        // 1- headMap verilen key'den basa kadar olan tum map'i verir.

        System.out.println(harflerMap.headMap("R")); // harf olmasa da sirasinda bakar
                                                    // olsa nerde olurdu tespit eder oradan basa dogru yazdiririn

        System.out.println(harflerMap.headMap("r")); //char sirasina bakiyor..!!


        System.out.println(harflerMap.headMap("P",true)); //eğer 2. parametre olarak true girilirse
        //girilen key bitis keyi olmasina ragmen dahil eder

        // 2- TailMap : girilen key dahil sonrasindaki entry'leri verir

        System.out.println(harflerMap.tailMap("F")); //baslangic oldugu icin dahil olur

        System.out.println(harflerMap.tailMap("K")); //baslangic oldugu icin olsa nerede olur bakar dahil olur

        System.out.println(harflerMap.tailMap("C",false));//C dahil değil demek


        // 3- lowerkey : verilen key'den kucuk olan keylerin en buyugu diger bir deyisle
        // verilen key'den bir onceki key
        //flooeKey : verilen key'den kucuk veya esit olan tum key'ler icinde en buyugu verir.
        //diger bir deyisle verilen key'i asagi dogru yuvarlar


        System.out.println(harflerMap.lowerKey("R")); //P
        System.out.println(harflerMap.lowerKey("G")); // F


        System.out.println(harflerMap.floorKey("S")); // S
        System.out.println(harflerMap.floorKey("R")); // P

        // 4- higherKey : verilen key'den buyuk olan key'ler icerisinde en kucuk olani verir.
        //ceilingKey : verilen key'den buyuk esit olan keyler icindeki en kucuk olani verir



        System.out.println(harflerMap.higherKey("R")); //S
        System.out.println(harflerMap.higherKey("G")); //O


        System.out.println(harflerMap.ceilingKey("S")); // S
        System.out.println(harflerMap.ceilingKey("R")); // S


        // 5- pollFirstEntry() ilk entry i siler ve bize getirir.


        System.out.println(harflerMap.pollFirstEntry()); //D=11

        System.out.println(harflerMap.pollLastEntry()); //S=33

        System.out.println(harflerMap2.pollFirstEntry()); //null

        System.out.println(harflerMap2.pollLastEntry()); //null

        System.out.println(harflerMap.descendingMap()); //{P=22, O=5, F=14}

        System.out.println(harflerMap.subMap("G", "P")); //{O=5}

        System.out.println(harflerMap.subMap("B", false, "T", true)); //{F=14, O=5, P=22}


    }


}
