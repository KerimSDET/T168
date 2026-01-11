package K35_collections.D01_linkedList_Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();


        /*
         inheritance hatirlanacagi uzere
         sayilar2 objesi LinkedList objesidir
         ANCAK data turu Queue secildiginden
         TUM QUEUE'lar ile ortak ozelliklerini gorebiliriz

         Queue ==> kuyruk
         eklenenler sona eklenir
         silinenler bastan silinir
         */

        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        queue1.add(6);
        queue1.add(7);
        queue1.add(8);
        queue1.add(9);
        queue1.add(10);


        System.out.println(queue1);

         //queue1 listesinden eleman silelim

        queue1.remove();
        System.out.println(queue1);

        queue1.remove();
        System.out.println(queue1);

        System.out.println("2. Kuyruk : "+queue2);

        //peek()
        System.out.println("Listeninbaşındaki elemanı getirdi: "+queue1.peek());
        System.out.println("Ama listemiz değişmedi " +queue1);

        /*
         Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
         queue'nun basindaki elementi silmeden bize getirir, liste bos ise null dondurur
         */

        //element
        System.out.println(queue1.element());
        //System.out.println(queue2.element());
        //Queue listemiz boş olduğu için Exception çıktı verdi.

        /*
         Retrieves, but does not remove, the head of this queue.
         queue'nun basindaki elementi silmeden bize getirir
         This method differs from peek only in that it throws an exception if this queue is empty.
         peek'den farki, bos queue'da kullanilirsa exception firlatmasidir
         */

        //poll()

        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue2.poll()); //null


         /*
         Retrieves and removes the head of this queue, or returns null if this queue is empty
         ilk elementi siler ve bize getirir, queue bos ise null getirir
         */

        // offer()

        System.out.println(queue1.offer(15));   //true gittim, kapasite sınırlaması engeli yoktu
                                                    // ve ben de eklediim dediği için true döndü. yani işlem başarılı dedi.
        System.out.println(queue1);


            /*
         Inserts the specified element into this queue
         if it is possible to do so immediately without violating capacity restrictions.
         When using a capacity-restricted queue,
         this method is generally preferable to add,
         which can fail to insert an element only by throwing an exception.

         add() ile ayni islemi yapar
         aralarindaki fark
         add() mutlaka ekler,
         offer() ise eklemeyi teklif eder
         Eger bir kapasite sinirlamasi yoksa EKLENIR
         kapasite sinirlamasi varsa exception firlatir
         */


    }
}
