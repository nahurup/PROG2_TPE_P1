package produ.criterios;

import java.util.List;
import produ.Participante;


public class CriterioAnd implements Criterio {

	private Criterio c1, c2;
	
    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		return (c1.cumpleConCriterio(participante) && c2.cumpleConCriterio(participante));
	}
	
}