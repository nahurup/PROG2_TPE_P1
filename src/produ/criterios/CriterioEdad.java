package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.Participante;

public class CriterioEdad implements Criterio {
    private int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return participantes.stream()
                .filter(participante -> participante.getEdad() > edad)
                .collect(Collectors.toList());
    }
}
