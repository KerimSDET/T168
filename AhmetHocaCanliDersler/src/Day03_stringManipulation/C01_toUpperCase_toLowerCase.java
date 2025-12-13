package Day03_stringManipulation;

public class C01_toUpperCase_toLowerCase {
    public static void main(String[] args) {



        String metin = "Bugün hava çok güzeldi";

        System.out.println(metin.toUpperCase()); //BUGÜN HAVA ÇOK GÜZELDİ


        System.out.println(metin);

        //Atirngde atama yapılmadıkça hazır metodla yapılan değişiklikler kalıcı olmaz.


        metin.toLowerCase(); //bugün hava çok güzeldi. ancak bu konsolda yazılmaz. sadece sout içind eatanarak yazılması şart
        System.out.println(metin);

        String str = "Bugün hava çok fazla güzeldi.";

        System.out.println(str.toUpperCase());

        System.out.println(metin.toLowerCase()); // bugün hava çok güzeldi


        // bir lokal dilde herhangi bir harfin küçük - büyük yazımı ile
        // aynı harfin ingilizcedeki küçük büyük yazılımı farklı ise
        // Java bilgisyarın dil tercihine bakar ve ona göre küçük büyük harf dönüşümünü yapar.


        System.out.println(str.toLowerCase());




    }
}
