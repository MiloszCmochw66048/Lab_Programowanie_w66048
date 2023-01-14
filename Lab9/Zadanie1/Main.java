package Zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Uczestnicy> uczestnicyList = new ArrayList<>(Arrays.asList(
                new Uczestnicy(1, "Krzysiek", 31),
                new Uczestnicy(2, "Macius", 15),
                new Uczestnicy(3, "Teodor", 20),
                new Uczestnicy(4, "Tymon", 18),
                new Uczestnicy(5, "Kamila", 43)
        ));

        for (Uczestnicy uczestnik : uczestnicyList) {
            int wiek = uczestnik.getWiek();
            boolean niepelnoletni = wiek < 18;
            if (niepelnoletni) System.out.println(uczestnik.getImie() + " niepełnoletni!");
        }
    }
}