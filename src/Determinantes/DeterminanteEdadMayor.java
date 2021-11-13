package Determinantes;

import java.util.Comparator;

import produccion.ElementoConcurso;

public class DeterminanteEdadMayor implements Comparator<ElementoConcurso> {

	@Override
	public int compare(ElementoConcurso o1, ElementoConcurso o2) {
		if (o1.getEdad() - o2.getEdad() > 0) {
			return 1;
		}
		else if (o1.getEdad() - o2.getEdad() == 0) {
			return 0;
		}
		else {
			return -1;
		}
	}
	

}
