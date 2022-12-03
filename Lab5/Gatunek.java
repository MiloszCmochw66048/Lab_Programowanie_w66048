public class Gatunek implements Cloneable{
    String nazwa_rodzaju, nazwa_gatunku, opis;
    int liczba_chromosomow_2n, podstawowa_liczba_chromosomow_x;

    public Gatunek() {
    }

    public Gatunek(String nazwa_rodzaju, String nazwa_gatunku, String opis, int liczba_chromosomow_2n, int podstawowa_liczba_chromosomow_x) {
        this.nazwa_rodzaju = nazwa_rodzaju;
        this.nazwa_gatunku = nazwa_gatunku;
        this.opis = opis;
        this.liczba_chromosomow_2n = liczba_chromosomow_2n;
        this.podstawowa_liczba_chromosomow_x = podstawowa_liczba_chromosomow_x;
    }

    public String getNazwa_rodzaju() {
        return nazwa_rodzaju;
    }

    public void setNazwa_rodzaju(String nazwa_rodzaju) {
        this.nazwa_rodzaju = nazwa_rodzaju;
    }

    public String getNazwa_gatunku() {
        return nazwa_gatunku;
    }

    public void setNazwa_gatunku(String nazwa_gatunku) {
        this.nazwa_gatunku = nazwa_gatunku;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getLiczba_chromosomow_2n() {
        return liczba_chromosomow_2n;
    }

    public void setLiczba_chromosomow_2n(int liczba_chromosomow_2n) {
        this.liczba_chromosomow_2n = liczba_chromosomow_2n;
    }

    public int getPodstawowa_liczba_chromosomow_x() {
        return podstawowa_liczba_chromosomow_x;
    }

    public void setPodstawowa_liczba_chromosomow_x(int podstawowa_liczba_chromosomow_x) {
        this.podstawowa_liczba_chromosomow_x = podstawowa_liczba_chromosomow_x;
    }

    public String getPelnaNazwa() {
        return nazwa_rodzaju + " " + nazwa_gatunku;
    }

    public String Dane() {
        return "Gatunek: " +
                "nazwa_rodzaju=" + nazwa_rodzaju +
                ", nazwa_gatunku=" + nazwa_gatunku +
                ", opis=" + opis +
                ", liczba_chromosomow_2n=" + liczba_chromosomow_2n +
                ", podstawowa_liczba_chromosomow_x=" + podstawowa_liczba_chromosomow_x;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
