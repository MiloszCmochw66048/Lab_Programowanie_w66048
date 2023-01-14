package Zadanie3;

class AdressError extends Exception{
    public AdressError(String message) {
        super(message);
    }
}

public class Adres {
    String ulica, kodPocztowy, miasto;
    int nrDomu;

    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws AdressError{

        String error = "";

        if(ulica == null) error += "Ulica nie moze byc null ";
        if(kodPocztowy == null) error += "Kod pocztowy nie moze byc null ";
        if(miasto == null) error += "Miasto nie moze byc null ";
        if(nrDomu <=0) error += "Numer domu musi byc liczba > 0 ";
        if(!error.equals("")) throw new AdressError(error);

        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }
}