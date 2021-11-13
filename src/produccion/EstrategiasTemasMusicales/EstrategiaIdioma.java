package produccion.EstrategiasTemasMusicales;

import produccion.ElementoConcurso;
import produccion.TemaMusical;

public class EstrategiaIdioma extends Estrategia {

	public EstrategiaIdioma(TemaMusical C) {
		super(C);
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return miembro.getIdiomas().contains(this.getCancion().getIdioma());
	}

}
