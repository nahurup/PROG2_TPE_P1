package produccion.criterios;

import java.util.ArrayList;

import produccion.ElementoConcurso;

public class CriterioVariosIdiomas implements Criterio {

	private ArrayList<String> listaIdiomas;
	
	public CriterioVariosIdiomas (ArrayList<String> idiomas) {
		this.listaIdiomas = idiomas;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return miembro.contieneIdiomas(listaIdiomas);
	}
	
}
