package Determinantes;

import java.util.Comparator;

import produccion.ElementoConcurso;

public class DeterminanteInstrumentoMayor implements Comparator<ElementoConcurso> {

	@Override
	public int compare(ElementoConcurso o1, ElementoConcurso o2) {
		if (o1.getInstrumentos().size() > o2.getInstrumentos().size()) {
			return 1;
		}
		else if (o1.getInstrumentos().size() == o2.getInstrumentos().size()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	

}
