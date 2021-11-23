package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioIdioma implements Criterio {

	private String idioma;
	
	public CriterioIdioma (String idioma) {
		this.idioma = idioma;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return miembro.contieneIdioma(idioma);
	}

}
