package Lab7.Zadanie3;

class main
{
	public static void main(String[] arg)
	{
		Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
		Trojkat rownoboczny = new Trojkat(7, 4, "bia�y");
		Kwadrat kwadrat = new Kwadrat(5,"czerwony");
		Punkt punkt = new Punkt(1,2);


		Figura[] tablicaFigur = new Figura[10];

		for (int i = 0; i < 10; i++) {
			tablicaFigur[i] = new Prostokat(i+1,i+2, "zolty");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(tablicaFigur[i].opis());
		}
		maly_punkt.skaluj(1.5f);

		IFigury [] figury = new IFigury[3];

		figury[0] = maly_punkt;
		figury[1] = rownoboczny;
		figury[2] = kwadrat;

		System.out.println(figury[0].getPowierzchnia());
		System.out.println(figury[1].getPowierzchnia());
		System.out.println(figury[2].getPowierzchnia());

		Okrag okrag = new Okrag(5,5,10);

		System.out.println(okrag.opis());
		okrag.skaluj(1.5f);
		okrag.przesun(3,5);
		System.out.println(okrag.opis());
	}
}