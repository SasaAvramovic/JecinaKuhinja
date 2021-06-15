package jecinaKuhinja;

import java.util.ArrayList;
import java.util.List;

public class Meni {
	private List<Jelo> listaJela;

	public Meni() {

		listaJela = new ArrayList<Jelo>();
	}

	public void dodajJelo(Jelo j) {
		listaJela.add(j);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < listaJela.size();i++) {
			sb.append(listaJela.get(i).getNazivJela());
			sb.append(": ");
			for (int j = 0; j < listaJela.get(i).getSastojci().size(); j++) {
				sb.append(listaJela.get(i).getSastojci().get(j).getNazivSastojka());
				sb.append(", ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}

	
	
}
