package Zadanie1;

import java.util.Objects;

public class Uczestnicy {

    String imie;
    int id, wiek;

    public Uczestnicy(int id, String imie, int wiek) {

        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnicy that = (Uczestnicy) o;
        return id == that.id && wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, id, wiek);
    }

    @Override
    public String toString() {
        return "Uczestnicy{" + "imie='" + imie + '\'' + ", id=" + id + ", wiek=" + wiek + '}';
    }
}