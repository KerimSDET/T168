package K13_MethodOlusturmaVeKullanma.Ders03_MethodOverLoading;

public class C03_Overloading {

    public static void main(String[] args) {

        topla(5); //topla int

        topla(4,9);

        topla(4.4,5.9);

        topla(3.3,'c');

        topla(4.5f,9);

    }
    public static void topla(int sayi) {
        System.out.println("int : "+(sayi+sayi));
    } //1 topla int

    public static void topla(int a,int b) {
        System.out.println("int int : "+(a+b));
    } //2 topla int int

    public static void topla(double c, int d) {
        System.out.println("double int : "+(c+d));
    } //3 topla double int
    public static void topla(float c, int d) {
        System.out.println("float int : "+(c+d));
    } //4 topla float int
    public static void topla(double c, double d) {
        System.out.println("double double :"+ (c+d));
    } //5 topla double double

}
