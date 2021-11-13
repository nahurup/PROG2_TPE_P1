package produccion.criterios;

import produccion.ElementoConcurso;


public class CriterioAnd implements Criterio {

	private Criterio c1, c2;
	
    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		return (c1.cumpleConCriterio(miembro) && c2.cumpleConCriterio(miembro));
	}
	
}