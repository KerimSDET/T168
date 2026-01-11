package Methods;

import java.util.*;

public class D09_ObjeOlustururkenDataTuruSecmeninOnemi {
    public static void main(String[] args) {


        List<String > isimlerArrayList = new ArrayList<>();
        List<String > isimlerLinkedList = new LinkedList<>();
        Queue<Integer > sayilarQueueLinkedList = new  LinkedList<>();
        Deque<Character > karakterQueueLinkedList = new  LinkedList<>();

        /*
        ilk iki elemanın constructorları Farklı olmasına rağmen
        Data türleri ortak olduğundan
        Aynı method'lara sahip olduklarını gördük

         Ancak 2,  ve 4. objelerin constructor'ları Aynı ama
         data türleri farklı olduğunda
         o data türüne ait spesifik method'lara sahipler
         orneğin Queue (kuyruk) olduğundan eklemenin sona yapılması
         başa yapılamaması silinen elemanların ise baştan silinmesinin
         Zorunlu olması lazım
         */


        System.out.println(karakterQueueLinkedList.hashCode());

        System.out.println(sayilarQueueLinkedList.add(45));
        System.out.println(sayilarQueueLinkedList);


    }
}
