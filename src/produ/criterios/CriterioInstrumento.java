package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.Participante;

public class CriterioInstrumento extends CriterioString {

    public CriterioInstrumento(String instrumento) {
        super(instrumento);
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return participantes.stream()
                .filter(participante -> participante.getInstrumentos().contains(getPalabra()))
                .collect(Collectors.toList());
    }
}
