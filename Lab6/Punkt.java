public class Punkt {
    public double x,y;

    public Punkt() {
        this.x = 1.1;
        this.y = 2.2;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        x=0.0;
        y=0.0;
    }

    String opis() {
        return "Klasa Punkt Pkt. o wsp.: [x,y]: [" + this.x + ", " + this.y + "]";
    }

    public void przesun(double x, double y){
        this.x += x;
        this.y += y;

    }
}
