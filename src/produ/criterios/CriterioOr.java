package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import produ.Participante;



public class CriterioOr extends CriterioBinario {

    public CriterioOr(Criterio a, Criterio b) {
        super(a, b);
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return Stream.concat(getA().filter(participantes).stream(), getB().filter(participantes).stream())
                .collect(Collectors.toList());
    }
}
