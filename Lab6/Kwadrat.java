public class Kwadrat extends Prostokat {

    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    String opis(){
        return "Klasa Kwadrat Szerokosc: " + szer + " Wyskosc: " + wys;
    }
}
