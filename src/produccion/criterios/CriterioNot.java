package produccion.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produccion.Participante;

public class CriterioNot implements Criterio {

    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		return !this.criterio.cumpleConCriterio(participante);
	}


}
