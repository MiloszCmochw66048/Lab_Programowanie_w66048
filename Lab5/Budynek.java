import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int liczbaPieter;
    LocalDate rokBudowy;

    public Budynek(String nazwa, int liczbaPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.liczbaPieter = liczbaPieter;
        this.rokBudowy = rokBudowy;
    }

    public long getDataBudowy(){
        LocalDate today = LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ileLat;
    }

    public void info(){
        System.out.println("Budynek: " + nazwa + " pieter: " + liczbaPieter + " rok budowy: " + rokBudowy + " wiek budowy: " + getDataBudowy());
    }
}