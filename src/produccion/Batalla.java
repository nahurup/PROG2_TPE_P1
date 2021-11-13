package produccion;

import java.util.Comparator;

public class Batalla {

	private Comparator<ElementoConcurso> determinanteGanador;
	
	public Batalla (Comparator<ElementoConcurso> D) {
		this.determinanteGanador = D;
	}
	
	public void setDeterminante (Comparator<ElementoConcurso> D) {
		determinanteGanador = D;
	}
	
	public Comparator<ElementoConcurso> getDeterminante () {
		return this.determinanteGanador;
	}
	
	public int iniciarBatalla (ElementoConcurso P1, ElementoConcurso P2) {
		return determinanteGanador.compare(P1, P2);
	}
}
