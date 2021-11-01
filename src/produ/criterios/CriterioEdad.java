package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.ElementoConcurso;
import produ.Participante;

public class CriterioEdad implements Criterio {
    private int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public Boolean cumpleConCriterio(ElementoConcurso e) {
		if (e.getEdad() > this.edad) {
			return true;
		}
		else {
			return false;
		}
	}

    
}
