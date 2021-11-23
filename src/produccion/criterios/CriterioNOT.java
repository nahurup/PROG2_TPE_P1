package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioNOT implements Criterio {

    private Criterio criterio;

    public CriterioNOT(Criterio criterio) {
        this.criterio = criterio;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return !this.criterio.cumpleConCriterio(miembro);
	}


}
