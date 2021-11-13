package Determinantes;

import java.util.Comparator;

import produccion.ElementoConcurso;

public class DeterminanteInvertido implements Comparator<ElementoConcurso> {
	
	private Comparator<ElementoConcurso> Determinante;
	
	public DeterminanteInvertido (Comparator<ElementoConcurso> D) {
		this.Determinante = D;
	}

	@Override
	public int compare(ElementoConcurso o1, ElementoConcurso o2) {
		return -1*Determinante.compare(o1, o2);
	}

}
