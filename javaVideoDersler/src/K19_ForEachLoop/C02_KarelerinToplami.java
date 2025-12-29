package K19_ForEachLoop;

public class C02_KarelerinToplami {
    public static void main(String[] args) {
        int [] arr= {1,3,5,7,2,1,3};

        //verilen arraydeki her elementin karelerini alıp
        //karelerin toplamını yazdıran bir method oluşturun

        karelerinToplaminiYazdir(arr);


    }

    public static void karelerinToplaminiYazdir (int [] arr){
        int karelerinToplami=0;


        for (int each:arr){
            karelerinToplami+=each*each;
                }

        System.out.println("For each ile Karelerin Toplamı methodu :"+karelerinToplami);
    }
}
