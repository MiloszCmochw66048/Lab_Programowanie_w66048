public class Ksiegarnia {
    String nazwa, adres;
    Ksiazka ksiazka;
    Klient klient;

    public Ksiegarnia(String nazwa, String adres, Ksiazka ksiazka, Klient klient) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.ksiazka = ksiazka;
        this.klient = klient;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
