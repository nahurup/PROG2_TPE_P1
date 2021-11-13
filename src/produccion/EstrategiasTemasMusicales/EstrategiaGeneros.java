package produccion.EstrategiasTemasMusicales;

import produccion.ElementoConcurso;
import produccion.TemaMusical;

public class EstrategiaGeneros extends Estrategia {

	public EstrategiaGeneros(TemaMusical C) {
		super(C);
	}

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		int generosCompatibles = 0;
		for (String G:miembro.getGeneros()) {
			if (this.getCancion().getGeneros().contains(G)) {
				generosCompatibles++;
			}
		}
		return generosCompatibles > 0;
	}

}
