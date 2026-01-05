package K21_staticKeyword;

public class C03_StaticBlocks {


    C03_StaticBlocks(){
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");

        C03_StaticBlocks obj = new C03_StaticBlocks();

        C03_StaticBlocks obj2 = new C03_StaticBlocks();

        method1();

//        static block1 çalıştı
//        static block2 çalıştı
//        Main method çalıştı
//        static olmayan kod blogu çalıştı
//        Constructor çalıştı
//        static olmayan kod blogu çalıştı
//        Constructor çalıştı
//        method çalıştı


    }

    public static void method1(){
        System.out.println("method çalıştı");
    }

    static {
        System.out.println("static block1 çalıştı");
    }

    static {
        System.out.println("static block2 çalıştı");
    }

    {
        System.out.println("static olmayan kod blogu çalıştı");
    }


}
