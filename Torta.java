package jecinaKuhinja;

public class Torta extends Jelo {

	public Torta(String nazivJela) {
		super(nazivJela);
	}

	public void procenatSecera() {
		double sec = 0;
		double ukupno = 0;
		for (int i = 0; i < super.sastojci.size(); i++) {
			ukupno = ukupno + super.kolicina.get(i);
			if (super.sastojci.get(i).getNazivSastojka().equals("secer")) {
				sec = super.kolicina.get(i);
			}
		}
		if (sec == 0) {
			System.out.println("Nema secera");
		} else {
			System.out.println(sec / ukupno * 100);
		}
	}

	public void imaLiMargarina() {
		boolean marker = false;
		for (int i = 0; i < super.sastojci.size(); i++) {
			if (super.sastojci.get(i).getNazivSastojka().equals("margarin")) {
				marker = true;
			}
		}
		if (marker) {
			System.out.println("Ima margarina");
		} else {
			System.out.println("Nema margarina");
		}
	}
}
