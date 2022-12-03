public class Powiesc extends Ksiazka{
    String gatunek;
    int liczbaStron;

    public Powiesc(String tytul, String autor, int rokWydania, String gatunek, int liczbaStron) {
        super(tytul, autor, rokWydania);
        this.gatunek = gatunek;
        this.liczbaStron = liczbaStron;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}
