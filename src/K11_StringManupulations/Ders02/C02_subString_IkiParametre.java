package K11_StringManupulations.Ders02;

public class C02_subString_IkiParametre {
    public static void main(String[] args) {

        String str = "Java öğrenen pişman olmaz...";
        //ilk kelime harici cümleyi yazdırın

        System.out.println(str.substring(5));

        //sadece 2. kelimeyi yazdırın


        System.out.println(str.substring(2,4));


    }
}
