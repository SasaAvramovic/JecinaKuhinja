package jecinaKuhinja;

public class Sastojak {
	
	private String nazivSastojka;
	private double cenaSastojka;
	public Sastojak(String nazivSastojka, double cenaSastojka) {
		super();
		this.nazivSastojka = nazivSastojka;
		this.cenaSastojka = cenaSastojka;
	}
	public double getCenaSastojka() {
		return cenaSastojka;
	}
	public void setCenaSastojka(double cenaSastojka) {
		if (cenaSastojka >= 0) {
			this.cenaSastojka = cenaSastojka;
		} else {System.out.println("Pogresan unos cene!");}
		
	}
	public String getNazivSastojka() {
		return nazivSastojka;
	}
	
	
	
}
