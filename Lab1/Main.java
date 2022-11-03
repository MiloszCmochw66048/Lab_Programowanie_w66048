import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println(zad1());
        //Zadanie 2
        System.out.println("Podaj a: ");
        int a = getInt();
        System.out.println("Podaj b: ");
        int b = getInt();
        zad2(a,b);
        //Zadanie 3
        System.out.println("Podaj liczbe do sprawdzenia: ");
        System.out.println(zad3(getInt()));
        //Zadanie 4
        System.out.println("Podaj liczbe do sprawdzenia: ");
        System.out.println(zad4(getInt()));
        //Zadanie 5
        System.out.println("Podaj liczbe aby podnieść ją do potęgi 3: ");
        System.out.println(zad5(getInt()));
        //Zadanie 6
        System.out.println("Podaj liczbe aby ją spierwiastować: ");
        System.out.println(zad6(getInt()));
        //Zadanie 7
        System.out.println("Podaj poczatek zakresu: ");
        int p = getInt();
        System.out.println("Podaj koniec zakresu: ");
        int k = getInt();
        if(p<k) {
            Random rand = new Random();
            System.out.println(zad7(losowa(p,k),losowa(p,k),losowa(p,k)));
        }else if (p>k){
            System.out.println("Błędznie podany zakres!");
        }

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static int losowa(int p, int k){
        return new Random().nextInt((k - p) + 1) + p;
    }
    public static String zad1(){
        return "Imie: Miłosz, Wiek: "+20;
    }

    public static void zad2(int a, int b){

        System.out.println("Suma a+b= "+(a+b));
        System.out.println("Suma a+b= "+(a-b));
        System.out.println("Suma a+b= "+(a*b));
    }

    public static boolean zad3(int a){
        if(a%2==0) return true;
        return false;
    }

    public static boolean zad4(int a) {
        if (a % 3 == 0 && a % 5 == 0) return true;
        return false;
    }

    public static double zad5(double a){
        return Math.pow(a,3);
    }

    public static double zad6(double a){
        return Math.sqrt(a);
    }

    public static boolean zad7(double a, double b, double c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                System.out.println("Z podanych boków można zbudować trójkąt prostokątny!");
                return true;
            }
            else{
                System.out.println("Z podanych boków nie można zbudować trójkąta prostokątnego!");
                return false;
            }
        }
        else {
            System.out.println("Z podanych boków nie można zbudować trójkąta!");
            return false;
        }
    }
}