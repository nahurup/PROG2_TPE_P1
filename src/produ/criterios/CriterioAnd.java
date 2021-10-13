package produ.criterios;

import java.util.List;
import produ.Participante;


public class CriterioAnd extends CriterioBinario {

    public CriterioAnd(Criterio a, Criterio b) {
        super(a, b);
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return getA().filter(getB().filter(participantes));
    }
}