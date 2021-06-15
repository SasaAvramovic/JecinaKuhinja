package jecinaKuhinja;

import java.util.ArrayList;
import java.util.List;

public class Jelo {
	private String nazivJela;
	protected List<Sastojak> sastojci;
	protected List<Integer> kolicina;
	
	public Jelo(String nazivJela) {

		this.nazivJela = nazivJela;
		sastojci = new ArrayList<Sastojak>();
		kolicina = new ArrayList<Integer>();
	}

	public String getNazivJela() {
		return nazivJela;
	}

	public List<Sastojak> getSastojci() {
		return sastojci;
	}
	
	public void dodajSastojak(Sastojak s, int kolicina) {
		sastojci.add(s);
		this.kolicina.add(kolicina);
	}
	
	public double cenaNamirnica() {
		double cena = 0;
		for (int i = 0; i < sastojci.size(); i++) {
			cena = cena + sastojci.get(i).getCenaSastojka() * kolicina.get(i) / 1000;
		}
		return cena;
	}
	
}
