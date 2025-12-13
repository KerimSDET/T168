package K11_StringManupulations.Ders05;

public class C01_StringFiyatlariToplama {
    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip
        // yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €
        // NOT : sondaki para birimi degisken olmalidir


        String fiyatstr1 = "15.30 €";
        String fiyatstr2 = "11.45 €";

        //önce para birimi kaydedelim

        int spaceIndex = fiyatstr1.indexOf(" ");
        String paraBirimi = fiyatstr1.substring(spaceIndex);


        fiyatstr1 = fiyatstr1.replaceAll("\\D", ""); //1530
        fiyatstr2 = fiyatstr2.replaceAll("\\D", ""); //1145

        double fiyat1 = Double.parseDouble(fiyatstr1)/100;
        double fiyat2 = Double.parseDouble(fiyatstr2)/100;

        System.out.println("Fiyatların Toplamı :" +(fiyat1+fiyat2)+paraBirimi);


    }
}
