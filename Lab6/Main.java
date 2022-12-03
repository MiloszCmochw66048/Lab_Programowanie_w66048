public class Main {
    public static void main(String[] args) {

        Punkt pk1 = new Punkt(2.3, 3.5);
        Punkt pk2 = new Punkt();
        Punkt pk3 = new Punkt();
        pk3.setX(3.3);
        pk3.setY(4.4);
        System.out.println("--------------------");
        System.out.println("Pk1: "+pk1.opis());
        pk1.przesun(1.2, -2.0);
        System.out.println("Pk1: "+pk1.opis());
        pk1.zeruj();
        System.out.println("Pk1: "+pk1.opis());
        System.out.println("--------------------");
        System.out.println("Pk2: "+pk2.opis());
        pk2.przesun(1.1, 2.2);
        System.out.println("Pk2: "+pk2.opis());
        System.out.println("--------------------");
        System.out.println("Pkt3: X "+pk3.getX());
        System.out.println("Pkt3: Y "+pk3.getY());
        pk3.przesun(3.3, 4.4);
        System.out.println("Pk3: "+pk3.opis());


        System.out.println("--------------------");
        Figura f1 = new Figura();
        Figura f2 = new Figura("czarny");
        Trojkat t1 = new Trojkat(5.0, 2.5);
        Prostokat p1 = new Prostokat(2.0, 4.0);
        Okrag o1 = new Okrag(new Punkt(4, 5), 10);
        Okrag o2 = new Okrag();


        System.out.println(f1.opis());
        System.out.println("Kolor: "+f2.getKolor());
        System.out.println("Pole prostokata: " + p1.getPowierzchnia());


        System.out.println("--------------------");
        System.out.println("Powierzchnia: "+o1.getPow());
        System.out.println("Srednica: "+o1.srednica());
        o2.setPromien(21);
        System.out.println("Promien: "+o2.getPromien());
        o2.wSrodku(new Punkt(3,2));


        System.out.println("--------------------");
        System.out.println("Prostokat p1: "+p1.opis());
        p1.przesun(2.0,4.0);
        System.out.println("Prostokat p1: "+p1.opis());
        Kwadrat k1 = new Kwadrat(5,5);
        System.out.println("Kwadrat: "+k1.opis());


        System.out.println("--------------------");
        System.out.println("Punkt: "+pk1.opis());
        System.out.println("Figura: "+f1.opis());
        System.out.println("Prostokat: "+p1.opis());
        System.out.println("Trojkat: "+t1.opis());
        System.out.println("Okrag: "+o1.opis());
        System.out.println("Kwadrat: "+k1.opis());

        System.out.println("--------------------");
        Prostokat prostokat1 = new Prostokat("zloty", 10,20);
        System.out.println("Prostakat1: "+prostokat1.opis());
        Kwadrat kwadrat1 = new Kwadrat(4,5);
        System.out.println("Kwadrat1: "+kwadrat1.opis());
        kwadrat1.setSzer(15);
        kwadrat1.setWys(30);
        System.out.println("Kwadrat1: "+kwadrat1.getSzer());
        System.out.println("Kwadrat1: "+kwadrat1.getWys());
        System.out.println("Kwadrat1: "+kwadrat1.opis());
        Trojkat trojkat1 = new Trojkat("zielony",7,8);
        System.out.println("Trojkat1: "+trojkat1.opis());

        System.out.println("--------------------------------------");
        Samochod s1 = new Samochod();
        System.out.println("S1: "+s1.opis_samochod());
        Samochod s2 = new Samochod("BMW", "M2","Sportback","Niebieski",2021,2000);
        System.out.println("S1: "+s2.opis_samochod());
        Samochod s3 = new Samochod();
        s3.setModel("Astra");
        s3.setMarka("Opel");
        s3.setKolor("Srebrny");
        s3.setNadwozie("Zwyklle");
        s3.setPrzebieg(200000);
        s3.setRokProdukcji(2004);
        System.out.println("S3 Marka: "+s3.getMarka());
        System.out.println("S3 Model: "+s3.getModel());
        System.out.println("S3 Kolor: "+s3.getKolor());
        System.out.println("S3 Nadwozie: "+s3.getNadwozie());
        System.out.println("S3 Przebieg: "+s3.getPrzebieg());
        System.out.println("S3 RokProdukcji: "+s3.getRokProdukcji());
        System.out.println("------------------");
        SamochodOsobowy so1 = new SamochodOsobowy("BMW", "M2","Sportback","Niebieski",2021,2000,3,4,5);
        System.out.println("SO1: "+so1.opis_samochod());
        SamochodOsobowy so2 = new SamochodOsobowy(3,3,3);
        System.out.println("SO2: "+so2.opis_samochod());
        System.out.println("--------------------------------------");
    }
}