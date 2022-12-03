import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Ptostokat p1 = new Ptostokat(3,4);
        Ptostokat p2 = new Ptostokat();

        p2.setSzerokosc(5);
        p2.setWysokosc(12);

        System.out.println("-----------------------------------");
        System.out.println("Szerokosc: "+p1.getSzerokosc());
        System.out.println("Wysokosc: "+p1.getWysokosc());
        System.out.println("Pole: "+p1.getPole());
        System.out.println("Obwod: "+p1.getObwod());
        System.out.println("Przekotna: "+p1.getPrzekatna());
        System.out.println("-----------------------------------");
        System.out.println("Szerokosc: "+p2.getSzerokosc());
        System.out.println("Szerokosc: "+p2.getWysokosc());
        System.out.println("Pole: "+p2.getPole());
        System.out.println("Obwod: "+p2.getObwod());
        System.out.println("Przekotna: "+p2.getPrzekatna());
        System.out.println("-----------------------------------");
        Budynek b1 = new Budynek("Wsiz",2, LocalDate.of(1990,1,1));
        Budynek b2 = new Budynek("Ratusz",4, LocalDate.of(1960,12,6));
        b1.info();
        b2.info();
        System.out.println("-----------------------------------");
        Gatunek g1 = new Gatunek("Pies", "Ssak", "Labrador",74,37);
        Gatunek g2 = (Gatunek) g1.clone();
        Gatunek g3 = new Gatunek();

        System.out.println("Opis: "+g1.Dane());
        System.out.println("Pelna nazwa: "+g1.getPelnaNazwa());

        System.out.println("Opis: "+g2.Dane());

        g3.setNazwa_rodzaju("Gad");
        g3.setNazwa_gatunku("Jaszczurka");
        g3.setOpis("Salamandra");
        g3.setLiczba_chromosomow_2n(70);
        g3.setPodstawowa_liczba_chromosomow_x(35);

        System.out.println("Rodzaj: "+g3.getNazwa_rodzaju());
        System.out.println("Gatunek: "+g3.getNazwa_gatunku());
        System.out.println("Opis: "+g3.getOpis());
        System.out.println("Chromosomy 2n: "+g3.getLiczba_chromosomow_2n());
        System.out.println("Chromosomy x: "+g3.getPodstawowa_liczba_chromosomow_x());
        System.out.println("-----------------------------------");
    }
}