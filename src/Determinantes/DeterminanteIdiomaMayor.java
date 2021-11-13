package Determinantes;

import java.util.Comparator;

import produccion.ElementoConcurso;

public class DeterminanteIdiomaMayor implements Comparator<ElementoConcurso> {

	@Override
	public int compare(ElementoConcurso o1, ElementoConcurso o2) {
		if (o1.getIdiomas().size() < o2.getIdiomas().size()) {
			return 1;
		}
		else if (o1.getIdiomas().size() == o2.getIdiomas().size()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	

}
