package Lab7.Zadanie2;

public class Wieloryb extends Ryba{

    String imie;
    int waga;

    public Wieloryb(String imie, int waga) {
        this.imie = imie;
        this.waga = waga;
    }

    public void jedz() {System.out.println(imie + " zjada");}
    public void wydalaj() {System.out.println(imie + " wydala");}
    public void plyn() {System.out.println(imie + " plynie");}
    public void wynurz() {System.out.println(imie + " wynurza sie");}
    public void zanurz() {System.out.println(imie + " zanurza sie");}

    @Override
    public void lec(){

    }

    @Override
    public void wyladuj(){

    }
}
