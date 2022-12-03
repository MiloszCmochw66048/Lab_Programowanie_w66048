public class Podrecznik extends Ksiazka{
    String wydawnictwo, przedmiot;
    int cena;

    public Podrecznik(String tytul, String autor, int rokWydania, String wydawnictwo, String przedmiot, int cena) {
        super(tytul, autor, rokWydania);
        this.wydawnictwo = wydawnictwo;
        this.przedmiot = przedmiot;
        this.cena = cena;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
