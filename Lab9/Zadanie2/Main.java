package Zadanie2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Osoba[] people = new Osoba[]{
                new Osoba("Miłosz", 25),
                new Osoba("Kacper", 20),
                new Osoba("Jakub", 18),
                new Osoba("Wojtuś", 27),
                new Osoba("Marek", 35)
        };

        List<Osoba> lista = new ArrayList<>(Arrays.asList(people));
        System.out.println("Lista początkowa: ");
        for (Osoba osoba : lista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }

        List<Osoba> podlista = lista.subList(2, 4);

        System.out.println("Podlista: ");

        for (Osoba osoba : podlista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }
        podlista.clear();

        System.out.println("Lista po usunięciu podlisty: ");
        for (Osoba osoba : lista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }
    }

}
