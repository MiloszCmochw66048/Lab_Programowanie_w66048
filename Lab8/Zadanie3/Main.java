package Zadanie3;

public class Main {
    public static void main(String[] args) {

        try{
            Adres adres = new Adres("Sucharskiego", "35-211", "Rzeszow", 2);
        }
        catch (AdressError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }

        try{
            Adres adres = new Adres("Sucharskiego", null, "Rzeszow", 2);
        }
        catch (AdressError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }

        try{
            Adres adres = new Adres("", "32-221", "Rzeszow", 2);
        }
        catch (AdressError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }

        try{
            Adres adres = new Adres(null, null, null, 0);
        }
        catch (AdressError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }
    }
}
