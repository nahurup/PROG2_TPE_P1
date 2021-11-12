package produccion.criterios;

import java.util.ArrayList;

import produccion.Participante;

public class CriterioVariosIdiomas implements Criterio {

	private ArrayList<String> listaIdiomas;
	
	public CriterioVariosIdiomas (ArrayList<String> idiomas) {
		this.listaIdiomas = idiomas;
	}

	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		return (participante.getIdiomas().containsAll(listaIdiomas));
	}
	
}
