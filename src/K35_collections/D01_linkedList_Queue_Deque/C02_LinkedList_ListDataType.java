package K35_collections.D01_linkedList_Queue_Deque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList_ListDataType {

    public static void main(String[] args) {

        List<String> sayilarEskiList = new ArrayList<>();
        List<Integer> sayilarList = new LinkedList<>();

        /*
            data turu List secildigi icin
            bugune kadar kullandigimiz arrayList ile ortak ozelliklere sahiptir

            daha dogrusu hem sayilar hem de sayilar1
            data turu secilen List Interface'indeki method'lara sahip olurlar
         */

        sayilarList.add(15);
        sayilarList.add(16);

        System.out.println(sayilarList);

        sayilarList.add(1,24);

        System.out.println(sayilarList);
    }
}
