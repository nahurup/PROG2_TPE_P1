package produccion.criterios;

import produccion.ElementoConcurso;

public class CriterioEdad implements Criterio {
    private int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		if (miembro.getEdad() > this.edad) {
			return true;
		}
		else {
			return false;
		}
	}

    
}
