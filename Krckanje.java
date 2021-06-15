package jecinaKuhinja;

public class Krckanje {

	public static void main(String[] args) {

		Sastojak kolenica = new Sastojak("kolenica", 500);
		Sastojak slanina = new Sastojak("Slanina", 800);
		Jelo pasulj = new Jelo("pasulj");
		pasulj.dodajSastojak(kolenica, 200);
		pasulj.dodajSastojak(slanina, 400);

		System.out.println(pasulj.getSastojci().get(0).getNazivSastojka());

		System.out.println(pasulj.cenaNamirnica());
		
		
		Sastojak secer = new Sastojak("secer", 200);
		Sastojak margarin = new Sastojak("margarin", 400);
		Sastojak mleko = new Sastojak("mleko", 150);
		
		Torta saher = new Torta("saher");
		saher.dodajSastojak(secer, 2000);
		saher.dodajSastojak(mleko, 1000);
		saher.dodajSastojak(margarin, 500);
		
		saher.procenatSecera();
		
		saher.imaLiMargarina();
		
		Supa pileca = new Supa("pileca", 120);
		pileca.dodajSastojak(slanina, 200);
		pileca.dodajSastojak(margarin, 300);
		pileca.dodajSastojak(secer, 100);
		
		
		Meni meni = new Meni();
		meni.dodajJelo(saher);
		meni.dodajJelo(pasulj);
		
		System.out.println(meni.toString());
	}

}
