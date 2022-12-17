package Lab7.Zadanie3;
//deklaracja klasy abstrakcyjnej

public abstract class Figura implements IFigury{
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	Figura(){punkt = new Punkt(0,0);}
	Figura(String kolor){this.kolor=kolor;}
	Figura(Punkt punkt){this.punkt=punkt;}
	String getKolor(){return kolor;}

	//metody abstrakcyjne
	abstract String opis();
	abstract void skaluj(float skala);
	public abstract float getPowierzchnia();
	public abstract boolean wPolu(Punkt P);
	}
