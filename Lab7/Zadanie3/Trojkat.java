package Lab7.Zadanie3;

class Trojkat extends Figura{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	void skaluj(float skala) {
		podst = (int) (podst * skala);
		wys = (int) (wys * skala);

		System.out.println("Po sklowaniu, podstawa: " + podst + " , wysokosc: " + wys);
	}
	@Override
	public float getPowierzchnia() {
		return (float) (0.5* podst * wys);
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}