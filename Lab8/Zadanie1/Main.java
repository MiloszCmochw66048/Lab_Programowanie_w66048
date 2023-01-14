package Zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        double userInput = 0;

        while(true) {
            try{
                userInput=input.nextDouble();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Podaj poprawna liczbe!");
                input.next();
            }
        }
        if(userInput<0){
            throw new IllegalArgumentException(String.format("Pierwiastek z liczby rzeczywistej %.4f nie istnieje!", userInput));
        }
        System.out.println(String.format("Pierwiastek z liczby rzeczywistej %.4f", userInput, Math.sqrt(userInput)));
    }
}