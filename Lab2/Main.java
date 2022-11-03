import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static float getFloat() {
        return new Scanner(System.in).nextFloat();
    }

    public static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static boolean getBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public static void zad1() {
        System.out.println("=================Zadanie 1=================");
        System.out.println("Równanie kwadratowe ma postać ax2+bx+c=0");
        System.out.println("Podaj a: ");
        double a=getDouble();
        System.out.println("Podaj b:");
        double b=getDouble();
        System.out.println("Podaj c:");
        double c=getDouble();

        double delta;
        delta=(Math.pow(b,2)-(4*a*c));

        if(delta>0){
            double x1 = (-b-(Math.sqrt(delta)))/(2*a);
            double x2 = (-b+(Math.sqrt(delta)))/(2*a);
            System.out.println("Równanie ma 2 rozwiązania!");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else if (delta==0) {
            double x=(-b/(2*a));
            System.out.println("Równanie ma 1 podwójne rozwiązanie x="+x);
        }
        else {
            System.out.println("Równanie nie ma rozwiązań!");
        }
        System.out.println("===========================================");
    }

    public static void zad2() {
        System.out.println("=================Zadanie 2=================");
        System.out.println("Podaj x: ");
        double x=getDouble();

        double a=x;
        if(x>0){
            a=(x*2);
        }
        else if (x==0) {
            a=0;
        }else if (x<0){
            a=(-3*x);
        }
        System.out.println("Funkcja a(x) dla argumentu x przyjmuje wartość: "+a);
        double b=x;
        if(x>=1){
            b=Math.pow(x,2);
        }
        else if (x<1) {
            b=x;
        }
        System.out.println("Funkcja b(x) dla argumentu x przyjmuje wartość: "+b);
        double c=x;
        if(x>2){
            c=(x+2);
        }
        else if(x==2) {
            c=0;
        }else if(x<2){
            c=(x-4);
        }
        System.out.println("Funkcja c(x) dla argumentu x przyjmuje wartość: "+c);
    }

    public static void zad3(){
       double tab[]= new double[3];
        System.out.println("Podaj 3 liczby które chcesz posortować:");
       for(int i=0;i<3;i++){
           tab[i]=getDouble();
       }

       Arrays.sort(tab);

        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }

    public static void zad4(){
        System.out.println("Tak - true");
        System.out.println("Nie - false");
        System.out.println("Czy pada deszcz?");
        boolean rain = getBoolean();

        System.out.println("Tak - true");
        System.out.println("Nie - false");
        System.out.println("Czy jest autobus?");
        boolean bus = getBoolean();

        if(rain && bus){
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        }
        else if((rain && (!bus)) || ((!rain) && (!bus))){
            System.out.println("Nie dostaniesz się na uczelnię");
        }
        else if((!rain) && bus) {
            System.out.println("Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody");
        }
    }

    public static void zad5(){
        System.out.println("Tak - true");
        System.out.println("Nie - false");
        System.out.println("Czy jest zniżka na samochód?");
        boolean znizka = getBoolean();

        System.out.println("Tak - true");
        System.out.println("Nie - false");
        System.out.println("Czy otrzymałeś podwyżkę?");
        boolean premia = getBoolean();

        if((!znizka) || premia){
            System.out.println("Możesz kupić samochód!, Zniżki na samochód nie ma");
        }
        else if((!znizka) || (!premia)){
            System.out.println("Zakup samochód trzeba odłożyć na później... Zniżki na samochód nie ma");
        }
        else if((znizka||premia)) {
            System.out.println("Możesz kupić samochód!");
        }
    }

    public static void zad6() {
        int x = 1;
        while (x == 1) {
            System.out.printf("Podaj 1 liczbe: ");
            double a = getDouble();
            System.out.printf("Podaj 2 liczbe: ");
            double b = getDouble();
            System.out.println("Wybierz operacje jaką chcesz wykonać:");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnożenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Reszta z dzielenia");
            System.out.println("6 - Wyjdź");

            int z = getInt();
            if (z >= 1 && z <=6) {
                switch (z) {
                    case 1:
                        System.out.println("Wynik: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Wynik: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Wynik: " + (a * b));
                        break;
                    case 4:
                        System.out.println("Wynik: " + (a / b));
                        break;
                    case 5:
                        System.out.println("Wynik: " + (a % b));
                        break;
                    case 6:
                        x = 0;
                        break;
                }
            }else System.out.println("Błędne dane!");
        }
    }
}