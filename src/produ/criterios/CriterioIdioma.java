package produ.criterios;

import java.util.List;
import java.util.stream.Collectors;

import produ.Participante;

public class CriterioIdioma extends CriterioString {

    public CriterioIdioma(String idioma) {
        super(idioma);
    }

    @Override
    public List<Participante> filter(List<Participante> participantes) {
        return participantes.stream()
                .filter(participante -> participante.getIdiomas().contains(getPalabra()))
                .collect(Collectors.toList());
    }
}
