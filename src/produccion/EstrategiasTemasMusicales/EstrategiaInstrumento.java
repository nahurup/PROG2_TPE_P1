package produccion.EstrategiasTemasMusicales;

import produccion.ElementoConcurso;
import produccion.TemaMusical;

public class EstrategiaInstrumento extends Estrategia {
	
	private int miembrosNecesarios;

	public EstrategiaInstrumento(TemaMusical C, int necesarios) {
		super(C);
		this.miembrosNecesarios = necesarios;
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		int miembrosCompatibles = 0;
		
		for (String instrumento:miembro.getInstrumentos()) {
			if (this.getCancion().getInstrumentos().contains(instrumento)) {
				miembrosCompatibles++;
			}
		}
		return miembrosCompatibles >= miembrosNecesarios;
	}

}
