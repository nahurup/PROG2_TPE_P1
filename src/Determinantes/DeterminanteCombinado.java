package Determinantes;

import java.util.Comparator;

import produccion.ElementoConcurso;

public class DeterminanteCombinado implements Comparator<ElementoConcurso> {

	private Comparator<ElementoConcurso> D1, D2;
	
	public DeterminanteCombinado (Comparator<ElementoConcurso> D1, Comparator<ElementoConcurso> D2) {
		this.D1 = D1;
		this.D2 = D2;
	}

	@Override
	public int compare(ElementoConcurso o1, ElementoConcurso o2) {
		if (D1.compare(o1, o2) == 0) {
			return D2.compare(o1, o2);
		}
		else {
			return D1.compare(o1, o2);
		}
	}
	
	
}
