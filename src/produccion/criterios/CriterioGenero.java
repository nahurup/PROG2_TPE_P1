package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioGenero implements Criterio {

	private String genero;
	
	public CriterioGenero (String genero) {
		this.genero = genero;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return miembro.contieneGenero(genero);
	}
}
