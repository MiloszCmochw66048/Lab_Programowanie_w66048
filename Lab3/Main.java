import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }

    public static void zad1() {
        int Pkt, suma = 0, ile = 0;
        System.out.println("Podaj liczbe studentow: ");
        int n = getInt();
        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj liczbe punktow 0-40");
                Pkt = getInt();
                if (Pkt >= 0 && Pkt <= 40) {
                    suma += Pkt;
                    n--;
                    ile++;
                }
                continue;
            }
            System.out.println("Suma: " + suma);
            System.out.println("Srednia: " + (double) (suma / ile)); //rzurowanie zmiennej
        } else System.out.println("W grupie musi byc przynajmniej 1 osoba");
    }

    public static void zad2() {
        int ujemne_suma=0, dodatnie_suma=0, dodatnie=0, ujemne=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe: ");
            int n = getInt();
            if(n>0){
                dodatnie_suma+=n;
                dodatnie++;
            }else{
                ujemne_suma+=n;
                ujemne++;
            }
        }
        System.out.println("Liczba dodatnich: "+dodatnie);
        System.out.println("Suma dodatnich: "+dodatnie_suma);
        System.out.println("Liczba ujemnych: "+ujemne);
        System.out.println("Suma ujemnych: "+ujemne_suma);

    }

    public static void zad3() {
        System.out.println("Podaj ile liczb ma mieć ciąg: ");
        int n = getInt();
        System.out.println("Podaj liczby: ");
        int suma=0,a;
        if(n>0){
            while(n>0){
                a =getInt();
                if(a%2==0){
                    suma+=a;
                }
                n--;
            }
            System.out.println("Suma= "+suma);
        }else System.out.println("Podana liczba musi być większa od 0!");

    }

    public static void zad4(){
        Random rand = new Random();
        System.out.println("Podaj ile liczb chcesz wylosować: ");
        int n = getInt();
        System.out.println("Wylosowane liczby: ");
        int suma=0,a;
        while(n>0){
            a = rand.nextInt(56)-10;
            System.out.println(a);
            if(a%2==0){
                suma+=a;
            }
            n--;
        }
        System.out.println("Suma liczb parzystych= "+suma);
    }

    public static void zad5() {
        System.out.println("Podaj ciąg znaków który chcesz sprawdzić: ");
        String linia = getString();
        String reverse = "";
        char znak;
        for(int i=0; i<linia.length();i++){
            znak=linia.charAt(i);
            reverse=znak+reverse;
        }
        if(linia.compareTo(reverse)==0){
            System.out.println("Podany ciąg znaków jest palindromem!");
        }else{
            System.out.println("Podany ciąg znaków nie jest palindromem!");
        }
    }
}
