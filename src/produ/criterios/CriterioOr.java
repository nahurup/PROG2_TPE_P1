package produ.criterios;
import produ.ElementoConcurso;
import produ.Participante;

public class CriterioOr implements Criterio {
	
	private Criterio c1, c2;

    public CriterioOr(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso e) {
		return (c1.cumpleConCriterio(e) || c2.cumpleConCriterio(e));
	}
    

}
