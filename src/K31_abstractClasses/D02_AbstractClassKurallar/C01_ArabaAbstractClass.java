package K31_abstractClasses.D02_AbstractClassKurallar;

public abstract class C01_ArabaAbstractClass {


    // bu class arabalarin barindirmasi gereken zorunlu parcalari
    // ve istege bagli olarak bulundurmasini istedigimiz ozellikleri belirlesin

    // klima
    // ==> zorunlu olmamali, concrete method

    public void klime() { //opsiyonel
        System.out.println("Arabalar isterlerse klimalı olabilirler");
    }


    // motor
    // zorunlu OLMALI, abstract method olusturmali

    public abstract void motor(); //zorunlu

    // her arabanin motoru farkli olabilir
    // AMMA mutlaka motoru olmalidir

    // sase
    // ==> zorunlu

    public abstract void sase();

    // sunroof
    // ==> zorunlu degil, cocrete method

    public void sunroof() {
        System.out.println("Arabalar isterlerse sunroof barındırabilirler");
    }

    // child class'lar olusturulduktan sonra
    // araba class'ina 2 method daha eklemek gerekti

    // gosterge ==> zorunlu abstract method

    public abstract void gosterge();


    // deri kaplama koltuk ==> zorunlu degil, concrete method

    public void deriKaplama(){
        System.out.println("Arabalar istenirse deri kaplamalı koltuklu olabilir");
    }



}
