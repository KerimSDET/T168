public class tst {
    public static void main(String[] args) {


        int sayi=4;
        String isim ="tuna";
       String isim2 = sayi+"1"; //kodda hata verirdi. tırnak içine aldık

        System.out.println(isim2+""+isim);

        System.out.println(sayi+""+1);


        System.out.println("------------");


        String s="Hello";
        String t=new String(s);

        if ("Hello".equals(s)) System.out.println("one");
        if (t==s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello"==s) System.out.println("four");
        if ("Hello"==t) System.out.println("five");

    }
}
