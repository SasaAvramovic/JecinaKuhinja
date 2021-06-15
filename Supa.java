package jecinaKuhinja;

public class Supa extends Jelo {
	private int duzinaKuvanja;

	public Supa(String nazivJela, int duzinaKuvanja) {
		super(nazivJela);
		this.duzinaKuvanja = duzinaKuvanja;
	}

	public int getDuzinaKuvanja() {
		return duzinaKuvanja;
	}
	
}
