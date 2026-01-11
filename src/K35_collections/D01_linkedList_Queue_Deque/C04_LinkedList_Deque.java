package K35_collections.D01_linkedList_Queue_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedList_Deque {

    public static void main(String[] args) {


        // Deque double ended queue demektir
        // method'lar basa ve sona uygulanacak sekilde 2'ye ayrilir

        Deque<Integer> deque = new LinkedList<>();

        //deque'e eleman ekleyelim

        deque.add(11);
        deque.add(12);
        deque.add(13);

        System.out.println(deque); //[11, 12, 13]

        deque.addFirst(9);
        deque.addLast(19);

        System.out.println(deque); //[9, 11, 12, 13, 19]

        deque.add(6);
        deque.add(16);
        deque.add(16);
        deque.add(16);


        System.out.println(deque); //[9, 11, 12, 13, 19, 6, 16, 16, 16]


        //deque'den eleman silin
        deque.remove(); //[11, 12, 13, 19, 6, 16, 16, 16] ilk elemanı sildi
        System.out.println(deque);

        deque.removeFirstOccurrence(16); //ilk 16 kullanımını siler
        System.out.println(deque);

        deque.removeFirstOccurrence(40); //son 40 kullanımını siler
        System.out.println(deque); //değişen birşey olmaz


        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);


        //push

        deque.push(44); //kapasite sınırlaması yoksa başa ekler
        System.out.println(deque);

        /*
         Pushes an element onto the stack represented by this deque
         (in other words, at the head of this deque)
         if it is possible to do so immediately without violating capacity restrictions,
         throwing an IllegalStateException if no space is currently available.
         This method is equivalent to addFirst.

         addFirst() ile ayni islevi yapar
         aralarindaki fark push() kapasite sinirlamasi yoksa ekler
         kapasite sinirlamasi varsa IllegalStateException firlatir
         */

    }
}
