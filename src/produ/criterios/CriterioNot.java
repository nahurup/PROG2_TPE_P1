package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.ElementoConcurso;
import produ.Participante;

public class CriterioNot implements Criterio {

    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso e) {
		return !this.criterio.cumpleConCriterio(e);
	}


}
