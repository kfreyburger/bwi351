package de.hslu.bw341_1.v06Liste;

public class Liste {
	Knoten anker;

	public Liste() {
		this.anker = null;
	}

	public void einfuegenAnfang(int Zahl) {
		this.anker = new Knoten(Zahl, this.anker);
	}

	public void einfuegenEnde(int Zahl) {
		if (this.anker != null) {
			// Suche Knoten, dessen Nachfolger auf null zeigt
			Knoten k = this.anker;
			while (k.Nf != null)
				k = k.Nf;
			// Knoten gefunden --> bekommt nun einen Knoten angehängt
			k.Nf = new Knoten(Zahl, null);
		} else
			// Sonderbehandlung zur Vermeidung von  
			// java.lang.NullPointerException
			this.einfuegenAnfang(Zahl);
	}

	public void einfuegenSortiert(int Zahl) {
		if (this.anker == null || Zahl < this.anker.Zahl)
			this.einfuegenAnfang(Zahl);
		else {
			// Suche Knoten, dessen Nachfolger einen größeren Wert besitzt,
			// als der einzufügende Wert
			Knoten k = this.anker;
			while (k.Nf != null && k.Nf.Zahl < Zahl)
				k = k.Nf;
			// Knoten gefunden --> bekommt nun einen Knoten angehängt
			k.Nf = new Knoten(Zahl, k.Nf);
		}
	}

}