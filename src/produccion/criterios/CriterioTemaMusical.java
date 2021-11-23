package produccion.criterios;

import produccion.ElementoConcurso;
import produccion.TemaMusical;

public class CriterioTemaMusical implements Criterio {
	
	private TemaMusical cancion;
	
	public CriterioTemaMusical (TemaMusical cancion) {
		this.cancion = cancion;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return cancion.puedeInterpretarlo(miembro);
	}
	
	

}
