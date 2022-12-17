package Lab7.Zadanie3;

class Prostokat extends Figura {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	void skaluj(float skala) {
		szer = (int) (szer * skala);
		wys = (int) (wys * skala);

		System.out.println("Szerokosc po skalowaniu: " + szer + " , wysokosc: " + wys);

	}
	@Override
	public float getPowierzchnia() {
		return szer * wys;
	}

	@Override
	public boolean wPolu(Punkt P) {
		return false;
	}
}