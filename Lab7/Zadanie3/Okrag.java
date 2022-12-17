package Lab7.Zadanie3;

public class Okrag extends Figura implements RuchFigury{
    int x,y,promien;

    public Okrag(int x, int y, int promien) {
        this.x = x;
        this.y = y;
        this.promien = promien;
    }

    @Override
    public void przesun(int x, int y) {
        this.x += x;
        this.y += y;
    }
    @Override
    String opis() {
        return "X: " + x + " , Y: " + y;
    }

    @Override
    void skaluj(float skala) {
        x = (int) (x * skala);
        y = (int) (y * skala);

        System.out.println("Po skalowaniu, X: " + x + " , Y: " + y);
    }

    @Override
    public float getPowierzchnia() {
        return (float) (Math.PI * Math.pow(promien, 2));
    }

    @Override
    public boolean wPolu(Punkt P) {
        return false;
    }
}
