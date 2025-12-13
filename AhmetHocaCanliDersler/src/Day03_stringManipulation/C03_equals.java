package Day03_stringManipulation;

public class C03_equals {

    public static void main(String[] args) {


        // primitive data türlerinde karşılaştırma operatoru ==dir.
        //Ancak == string için beklendiği gibi çalışmayabilir.


        String str1 = "Bulut";
        String str2 = "Bulut";
        String str3 = "Bul" + "ut";
        String str4 = new String("Bulut");
        String str5 = "Bul";
        String str6 = "ut";
        String str7 = str5+str6;

        System.out.println(str1 == str2);  //Bulut == Bulut mantıken true
        System.out.println(str1 == str3);  //Bulut == Bulut mantıken true
        System.out.println(str1 == str4);  //Bulut == Bulut mantıken false
        System.out.println(str1 == str7);  //Bulut == Bulut mantıken false
        System.out.println(str1 == "Bulut");  //Bulut == Bulut mantıken true


        //şimdilik metinleri karşılaştırmak için == yerine equals() kullanmayı tercih ederiz.
        //equals() verilen iki metnin tamamen aynı olup olmadığını kontrol eder.
        //harf farklılığı (büyük küçük harf farklılığı da dahil) veya
        //metinler TAMAMEN aynıysa TRUE verir.

        System.out.println("=============");

        System.out.println(str1.equals(str2));  //Bulut == Bulut mantıken true
        System.out.println(str1.equals(str3));  //Bulut == Bulut mantıken true
        System.out.println(str1.equals(str4));  //Bulut == Bulut mantıken true
        System.out.println(str1.equals(str7));  //Bulut == Bulut mantıken true
        System.out.println(str1.equals("Bulut"));  //Bulut == Bulut mantıken true
        System.out.println(str1.equals("bulut"));  //Bulut == Bulut mantıken false



    }
}
