package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioCantMiembrosQueCumplen implements Criterio {
	
	private int cantidadNecesaria;
	private Criterio criterio;
	
	public CriterioCantMiembrosQueCumplen (int cant, Criterio crit) {
		this.cantidadNecesaria = cant;
		this.criterio = crit;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		int cantMiembrosQueCumplen = 0;
		for (ElementoConcurso M:miembro.getMiembros()) {
			if (criterio.cumpleConCriterio(M)) {
				cantMiembrosQueCumplen++;
			}
		}
		return cantMiembrosQueCumplen >= cantidadNecesaria;
	}

}
