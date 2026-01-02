package K26_stringBuilder;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        //StringBuilder sb = new StringBuilder("Java'da ne numaralar var.");


        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Candır.");
        sb.append( 3);
        sb.append(true);

        System.out.println(sb);

        String str ="Ali topu at";
        sb.append(str,3,8);
        System.out.println(sb);


        String cumle ="Kerem Taner";
        System.out.println(cumle);
        System.out.println(cumle.replace("Kerem", "Kerim"));

        sb.replace(11,18,"*");
        System.out.println(sb);

        sb.replace(11,18,".");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); //yapılan değişklik kalıcıdır

        sb.reverse();
        System.out.println(sb);

        sb.insert(4, " hem");
        System.out.println(sb);

        sb.deleteCharAt(15);
        System.out.println(sb);






    }
}
