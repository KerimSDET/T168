package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C07_ElementArama {
    public static void main(String[] args) {
        //verilen String bir array'de istenen bir elemanın var olup olmadığını
        //ve varsa kaç kere kullanıldığını yazdırın


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf ="a";

        int sayac =0;

        for (int i = 0; i < harfler.length; i++) {

            if ( harfler[i].equals(arananHarf)){
                sayac++;
            }

        }

        if (sayac ==0){
            System.out.println("Aranan değer Array içinde yok.");
        } else {
            System.out.println("Aranan değer "+sayac+" kez kullanılmıştır.");
        }


    }
}
