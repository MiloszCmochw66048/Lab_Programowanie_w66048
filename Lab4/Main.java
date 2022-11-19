import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }

    public static int Losowanie(){
        Random rand = new Random();
        int a =rand.nextInt(100)+1;
        return a;
    }

    public static void zadanie1() {
        System.out.println("-------ZADANIE 1-------");
        System.out.println("Ile elementow powinna mieć tablica: ");
        int a = getInt();
        int[] tab = new int[a];
        int suma = 0;
        int suma2 = 0;

        System.out.println("---------Wylosowana elementy--------");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Losowanie();
            System.out.println("Wylosowane: " + tab[i]);
        }

        System.out.println("---------Wartosci policzone petla for--------");
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        System.out.println("Ilosc elementow: " + tab.length);
        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + (suma / tab.length));

        System.out.println("---------Wartosci policzone petla for each-------");
        for (int i : tab) {
            suma2 += i;
        }
        System.out.println("Ilosc elementow: "+tab.length);
        System.out.println("Suma: "+suma2);
        System.out.println("Srednia: "+(suma2/ tab.length));
    }

    public static void zadanie2(){

        int[] tab = new int[4];
        int[] tab2 = new int[7];

        System.out.println("---------Wylosowana tablica z parzysta liczba elementow--------");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Losowanie();
            System.out.println("Wylosowane: " + tab[i]);
        }
        System.out.println("Wylosowany co 2 element z tablicy parzystej");
        for(int i=0;i< tab.length;i++){
            if(i%2==0) {
                System.out.println(tab[i]);
            }
        }

        System.out.println("---------Wylosowana tablica z nieparzysta liczba elementow--------");
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = Losowanie();
            System.out.println("Wylosowane: " + tab2[i]);
        }
        System.out.println("Wylosowany co 2 element z tablicy nieparzystej");
        for(int i=0;i< tab2.length;i++){
            if(i%2==0) {
                System.out.println(tab2[i]);
            }
        }
    }

    public static void zadanie3(){
        System.out.println("-------ZADANIE 3--------");
        System.out.println("Ile slow powinna miec tablica: ");
        int a=getInt();
        String [] slowa = new String[a];

        for(int i=0;i<slowa.length;i++){
            System.out.println("Wpisz "+(i+1)+" slowo: ");
            slowa[i]=getString();
        }

        System.out.println("-----------Podane slowa z tablicy z wielkimi literami----------");
        for(int i=0;i<slowa.length;i++){
            System.out.println(slowa[i].toUpperCase());
        }
    }

    public static void zadanie4(){
        System.out.println("---------ZADANIE 4--------");
        System.out.println("Ile slow powinna miec tablica: ");
        int a=getInt();
        String [] slowa = new String[a];

        for(int i=0;i<slowa.length;i++){
            System.out.println("Wpisz slowo: ");
            slowa[i]=getString();
        }

        System.out.println("--------------------------");
        for(int i=slowa.length-1;i>=0;i--){
            StringBuilder reverse = new StringBuilder(slowa[i]).reverse();
            System.out.println(reverse);
        }
    }

    public static void zadanie5(){
        System.out.println("ZADANIE 5: ");
        System.out.println("Podaj ilosc elementow tablicy: ");
        int a=getInt();
        int []tab=new int[a];

        for(int i=0; i<tab.length;i++){
            System.out.println("Podaj "+(i+1)+" element: ");
            tab[i]=getInt();
        }

        System.out.println("--------Tablica nieposortowana--------");
        for(int i=0; i<tab.length;i++){
            System.out.println(tab[i]);
        }

        System.out.println("--------Tablica posortowana--------");
        Arrays.sort(tab);
        for(int i=0; i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }

    public static void zadanie6(){
        System.out.println("-------ZADANIE 6-------");
        System.out.println("Podaj 5 elementow: ");

        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = getInt();;
        }
        int fact = 1;
        for(int i = 0;i<tab.length;i++){
            fact =1;
            for(int j=1;j<=tab[i];j++){
                fact=fact*j;
            }
            System.out.println("Silnia liczby "+tab[i]+" to: "+fact);
        }
    }

    public static void zadanie7(){
        System.out.println("---------ZADANIE 7--------");

        String[] slowa1 = {"Maciek", "Krzysiek", "Kuba"};
        String[] slowa2 = {"Maciek", "Krzysiek", "Kuba"};

        int counter = 0;

        for (int i = 0; i < slowa1.length; i++){

            if(slowa1[i] == slowa2[i] && slowa1.length == slowa2.length) {
                counter++;
            }
        }

        if(counter == slowa1.length){
            System.out.println("Tablice sa takie same");
        }
        else {
            System.out.println("Tablice sa rozne");
        }

    }
}