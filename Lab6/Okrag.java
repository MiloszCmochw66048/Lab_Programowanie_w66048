public class Okrag extends Figura{
    public Punkt srodek = new Punkt(0,0);
    public double promien;

    public  Okrag(){
        srodek.x = 0;
        srodek.y = 0;
        promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPow() {
        return Math.PI * Math.pow(this.promien, 2.0);
    }

    public double srednica() {
        return 2.0 * this.promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public void wSrodku(Punkt p) {
        double lewaStrona = Math.pow(this.srodek.x - p.x, 2.0) + Math.pow(this.srodek.y - p.y, 2.0);
        double prawaStrona = Math.pow(this.promien, 2.0);
        if (lewaStrona <= prawaStrona) {
            System.out.println("Pkt. [" + p.x + ", " + p.y + "], znjaduje sie wewnatrz okregu");
        } else {
            System.out.println("Pkt lezy poza okregiem");
        }
    }
    String opis(){
        return "Klasa Okrag Szerokosc: " + srodek + " Wyskosc: " + promien;
    }
}
