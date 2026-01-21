package K36_maps.D07_computeMethodlari;

import java.util.HashMap;
import java.util.Map;


public class C02_ComputeMethodlari {

    public static void main(String[] args) {
        Map<String, Integer> harfler = new HashMap<>();

        harfler.put("a",20);
        harfler.put("b",40);
        harfler.put("k",30);
        harfler.put("t",20);
        harfler.put("z",40);


        System.out.println(harfler); //{a=20, b=40, c=30, d=20, e=40}


        //Map'teki b'nin değerini 5 artırın.
        int eskiDeger = harfler.get("b"); // 40
        harfler.put("b",eskiDeger+5);

        System.out.println(harfler ); //{a=20, b=45, t=20, z=40, k=30}

        //map te key oarlak s varsa değerini 2 katına çıkarın

        if (harfler.containsKey("s")){
            eskiDeger = harfler.get("s");
            harfler.put("s",eskiDeger*2);
        }

        System.out.println(harfler ); // s olmadığı için gerçekleşen işlme olmayacak
        //{a=20, b=45, t=20, z=40, k=30}

        //mapte key olarak t varsa değerini 2 katına çıakrın

        if (harfler.containsKey("t")){
            eskiDeger = harfler.get("t");
            harfler.put("t",eskiDeger*2);
        }

        System.out.println(harfler );
        //{a=20, b=45, t=20, z=40, k=30}
        //{a=20, b=45, t=40, z=40, k=30}


        //eğer k harfi varsa değerini 5 artırın
        //pratik başka yolu var:

        harfler.computeIfPresent("k",(k,v)->v-5);
        System.out.println(harfler );
        //{a=20, b=45, t=40, z=40, k=30}
        //{a=20, b=45, t=40, z=40, k=25}

        //eğer t harfi varsa değerini 5 artırın
        //pratik başka yolu var:

        harfler.computeIfPresent("t",(a,b)->b-5);
        System.out.println(harfler );
        //{a=20, b=45, t=40, z=40, k=25}
        //{a=20, b=45, t=35, z=40, k=25}

        //a nın değerini, eski değerinin 2 katını

        harfler.computeIfPresent("a",(k,v)->v*2+3);
        System.out.println(harfler);
        //{a=20, b=45, t=35, z=40, k=25}
        //{a=43, b=45, t=35, z=40, k=25}




        //r yoksa değeri 35 olsun
        harfler.putIfAbsent("r",35);

        System.out.println(harfler );
        //{a=43, b=45, t=35, z=40, k=25}
        //{a=43, b=45, r=35, t=35, z=40, k=25}

        //eğer s harfi yoksa derğeini 25 oalrak mape ekleyiniz

        harfler.computeIfAbsent("s",v->25);

        System.out.println(harfler );
        //{a=43, b=45, t=35, z=40, k=25}
        //{a=43, b=45, r=35, t=35, z=40, k=25}
        //{a=43, b=45, r=35, s=25, t=35, z=40, k=25}


        //eğer T hatfi yoksadeğeri 40 olarak mape ekleyin
        harfler.putIfAbsent("t",40);
        System.out.println(harfler); //değişen birşey olmadı çünkü

        //eğer Y harfi yoksa değerini 44 olarak Map'e ekleyin

        harfler.putIfAbsent("Y",44);
        System.out.println(harfler);
        //{a=43, b=45, r=35, s=25, t=35, z=40, k=25}
        //{a=43, b=45, r=35, s=25, t=35, Y=44, z=40, k=25}


        harfler.putIfAbsent("y",63);
        System.out.println(harfler);
        //{a=43, b=45, r=35, s=25, t=35, Y=44, z=40, k=25}
        //{a=43, b=45, r=35, s=25, t=35, Y=44, y=63, z=40, k=25}





    }
}
