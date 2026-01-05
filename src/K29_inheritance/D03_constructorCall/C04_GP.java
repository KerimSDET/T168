package K29_inheritance.D03_constructorCall;

public class C04_GP {
    C04_GP (){
        System.out.println("GP parametresiz constructor çalıştı");
    }

    C04_GP(String s){
        this(4);
        System.out.println("GP String parametreli constructor çalıştı");
        }

        C04_GP(int a){
            System.out.println("GP int parametreli constructor çalıştı");
        }


}
