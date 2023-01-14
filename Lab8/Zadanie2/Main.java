package Zadanie2;

class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("5! = " + silnia(5));
            System.out.println("1! = " + silnia(1));
            System.out.println("-2! = " + silnia(-2));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Silnia z liczby <0 nie istnieje!");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
