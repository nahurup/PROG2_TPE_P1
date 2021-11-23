package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioInstrumento implements Criterio {
	
	private String instrumento;
	
	 public CriterioInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return miembro.contieneInstrumento(instrumento);
	}

}
