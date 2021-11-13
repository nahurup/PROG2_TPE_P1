package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioNot implements Criterio {

    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return !this.criterio.cumpleConCriterio(miembro);
	}


}
