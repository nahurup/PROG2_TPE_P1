package produccion;

import produccion.criterios.Criterio;

public class TemaMusicalFinal extends TemaMusical {
	
	private int cantMiembrosRequeridos;

	public TemaMusicalFinal(String titulo, String idioma, Criterio estrategia, int cantMiembros) {
		super(titulo, idioma, estrategia);
		this.cantMiembrosRequeridos = cantMiembros;
	}
	
	public void setCantMiembros (int cantM) {
		this.cantMiembrosRequeridos = cantM;
	}
	
	@Override
	public Boolean puedeInterpretarlo (ElementoConcurso miembro) {
		int cantMiembrosQueCumplen = 0;
		for (ElementoConcurso M:miembro.getMiembros()) {
			if (getEstrategia().cumpleConCriterio(M)) {
				cantMiembrosQueCumplen++;
			}
		}
		return cantMiembrosQueCumplen >= cantMiembrosRequeridos;
	}

}
