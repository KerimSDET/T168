package K26_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(); //içine 16 karakter konulabilir bir boş sb üretir.

        System.out.println("sb1 : "+sb1);
        System.out.println("sb1'in uzunluğu :" +sb1.length());
        System.out.println("sb1'in kapasitesi : "+sb1.capacity());

        sb1.append("Java Candır.");
        System.out.println("sb1 : "+sb1);
        System.out.println("sb1'in uzunluğu :" +sb1.length());
        System.out.println("sb1'in kapasitesi : "+sb1.capacity());



        StringBuilder sb2 = new StringBuilder(7); //Java 7 karakter alabilecek kapasitede boş bir sb oluşturur.
        System.out.println("sb2 : "+sb2);
        System.out.println("sb2'nin uzunluğu :" +sb2.length());
        System.out.println("sb2'nin kapasitesi : "+sb2.capacity());

        sb2.append("Kerem");
        System.out.println("sb2 : "+sb2);
        System.out.println("sb2'nin uzunluğu :" +sb2.length());
        System.out.println("sb2'nin kapasitesi : "+sb2.capacity());



        StringBuilder sb3 = new StringBuilder("Java"); //kapasitesi 4 olmaz ama 16+4 20 olur. 16 boş haliydi
        System.out.println("sb3 : "+sb3);
        System.out.println("sb3'ün uzunluğu :" +sb3.length());
        System.out.println("sb3'ün kapasitesi : "+sb3.capacity());

        sb3.append(" öğrenen pişman olmaz.");
        System.out.println("sb3 : "+sb3);
        System.out.println("sb3'ün uzunluğu :" +sb3.length());
        System.out.println("sb3'ün kapasitesi : "+sb3.capacity());




    }
}
