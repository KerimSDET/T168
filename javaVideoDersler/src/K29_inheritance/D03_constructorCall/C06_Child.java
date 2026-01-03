package K29_inheritance.D03_constructorCall;

public class C06_Child extends C05_P{


    C06_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor çalıştı");
    }


    C06_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor çalıştı");
    }


    C06_Child(int a){
        //super()
        System.out.println("C int parametreli constructor çalıştı");
    }


    public static void main(String[] args) {

        C06_Child child1 = new C06_Child(10);

        System.out.println("------------");

        C06_Child child2 = new C06_Child();

        System.out.println("------------");

        C06_Child child3 = new C06_Child("Kerem");

    }
}
