package K20_Constructors.D02_ObjelereDegerAtamaVeParamatrizedConstructors;

public class C06_OkulRunner_ParametreliConstructor {

    public static void main(String[] args) {


        C05_Okul ogr1 = new C05_Okul();


        System.out.println(ogr1.toString());

        System.out.println("---------");


        C05_Okul ogr2 =new C05_Okul("Kerem Taner","Atakent","5327827074");

        System.out.println(ogr2.toString());

        C05_Okul ogr3 =new C05_Okul("KeremTaner","Ata kent","5327827074", "3-D");

        System.out.println(ogr3.toString());


    }
}
