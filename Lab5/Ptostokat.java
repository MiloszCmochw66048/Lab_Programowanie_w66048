public class Ptostokat {
    double szerokosc, wysokosc;

    public Ptostokat() {
    }

    public Ptostokat(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getPole(){
        return wysokosc * szerokosc;
    }

    public double getObwod(){
        return 2*szerokosc+2*wysokosc;
    }

    public double getPrzekatna(){
        double przekotna = Math.pow(szerokosc,2) + Math.pow(wysokosc,2);

        return Math.sqrt(przekotna);
    }
}
