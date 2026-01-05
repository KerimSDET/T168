package K13_MethodOlusturmaVeKullanma.Ders01_MethodNicinKullanilir;

public class C02_KendiStringMethodMethodumuz {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir metinden
        kullanıcının girdiği başlangıç ve bitiş indexerini arasındaki kısmı yazdırın

        Kurallar :
        1-eğer başlangıç veya bitiş indexi negatif veya netnin sınırları dışındaysa hata verin
        2-başlangıç indexi biriş indexinden büykse hata mesajı verin
        3-başlangıç indexindeki karakter dahil, bitiş indexindeki karkter hariç olmalıdır.

         */

        String str = "Java Candır";

        int basIndex =2;
        int bitIndex =6;


//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Lütfen bir metin giriniz : ");

        if (basIndex<0 || bitIndex<0 || basIndex>=str.length() || bitIndex>=str.length()){
            System.out.println("Girilen başlangıç değerleri geçersiz");
        } else if (basIndex>bitIndex) {
            System.out.println("Başlangıç indexi bitiş indeksinden büyük olamaz.");
        } else  {

            for (int i = basIndex; i < bitIndex ;i++) {
                System.out.print(str.charAt(i));
            }
        }

    }
}
