package produccion.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produccion.Participante;

public class CriterioEdad implements Criterio {
    private int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		if (participante.getEdad() > this.edad) {
			return true;
		}
		else {
			return false;
		}
	}

    
}
