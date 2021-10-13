package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.Participante;

public class CriterioGenero extends CriterioString {

    public CriterioGenero(String genero) {
        super(genero);
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return participantes.stream()
                .filter(participante -> participante.getGeneros().contains(getPalabra()))
                .collect(Collectors.toList());
    }
}
