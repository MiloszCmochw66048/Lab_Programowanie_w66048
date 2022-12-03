public class Samochod {

    String marka, model, nadwozie, kolor;
    int rokProdukcji;
    double przebieg;

    public Samochod() {
        setMarka("Audi");
        setKolor("Czarny Mat");
        setModel("RS6");
        setNadwozie("SportBack");
        setRokProdukcji(2022);
        setPrzebieg(1000);
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        if(przebieg<=0){
            this.przebieg = 0;
        }
        else {
            this.przebieg = przebieg;
        }
    }

    String opis_samochod() {
        return "Samochod" +
                "marka=" + marka +
                ", model=" + model +
                ", nadwozie=" + nadwozie +
                ", kolor=" + kolor +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg;
    }
}
