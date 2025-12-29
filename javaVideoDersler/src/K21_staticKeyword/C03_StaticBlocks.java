package K21_staticKeyword;

public class C03_StaticBlocks {


    C03_StaticBlocks(){
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");



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


}
