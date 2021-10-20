package produ.criterios;
import produ.Participante;

public class CriterioOr implements Criterio {
	
	private Criterio c1, c2;

    public CriterioOr(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		return (c1.cumpleConCriterio(participante) || c2.cumpleConCriterio(participante));
	}
    

}
