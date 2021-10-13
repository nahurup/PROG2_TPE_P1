package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;
import produ.Participante;

public class CriterioNot implements Criterio {

    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        List<Participante> filtrado = criterio.filter(participantes);
        return participantes.stream()
                .filter(participante -> !filtrado.contains(participante))
                .collect(Collectors.toList());

    }
}
