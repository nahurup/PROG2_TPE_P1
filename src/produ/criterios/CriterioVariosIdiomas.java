package produ.criterios;

import java.util.ArrayList;

import produ.ElementoConcurso;
import produ.Participante;

public class CriterioVariosIdiomas implements Criterio {

	private ArrayList<String> listaIdiomas;
	
	public CriterioVariosIdiomas (ArrayList<String> idiomas) {
		this.listaIdiomas = idiomas;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso e) {
		return (e.getIdiomas().containsAll(listaIdiomas));
	}
	
}
