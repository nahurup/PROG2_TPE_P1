package produ;
import java.util.ArrayList;
import java.util.Comparator;

import produ.criterios.Criterio;

public class Batalla {
	//Atributos
	private ElementoConcurso e1;
	private ElementoConcurso e2;
	ArrayList<Comparator> formasBatalla = new ArrayList<Comparator>();
	
	public Batalla(ElementoConcurso e1, ElementoConcurso e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public void addFormaBatalla(Comparator<ElementoConcurso> forma) {
		if(!formasBatalla.contains(forma)) {
			formasBatalla.add(forma);
		}
	}
	
	public void deleteFormaBatalla(Comparator<ElementoConcurso> forma) {
		if(formasBatalla.contains(forma)) {
			formasBatalla.remove(forma);
		}
	}
	
	public int iniciarBatalla() {
		int result = 0;
		
		for(Comparator f: formasBatalla) {
			if (f.compare(e1, e2) == 1) {
				result = f.compare(e1, e2);
			} else if (f.compare(e1, e2) == -1) {
				result = f.compare(e1, e2);
			} 
		}
		
		return result;
	}
}
