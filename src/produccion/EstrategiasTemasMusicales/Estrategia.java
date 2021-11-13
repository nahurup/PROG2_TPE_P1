package produccion.EstrategiasTemasMusicales;

import produccion.TemaMusical;
import produccion.criterios.Criterio;

public abstract class Estrategia implements Criterio {

	private TemaMusical cancion;
	
	public Estrategia (TemaMusical C) {
		this.cancion = C;
	}
	
	public TemaMusical getCancion () {
		return cancion;
	}
}
