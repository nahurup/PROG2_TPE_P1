package produ.criterios;

import java.util.List;

import produ.Participante;

public interface Criterio {
	List<Participante> filter(List<Participante> participantes);
}
