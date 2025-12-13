package K11_StringManupulations.Ders04;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {
        String s1 ="";
        String s2 =" ";
        String s3 ="      ";
        String s4 ="Hello World";


        System.out.println(s4.isEmpty());//false içi boş mu?
        System.out.println(s4.isBlank());//false boşluklardan mı oluşuyor?

        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());

        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());


    }
}
