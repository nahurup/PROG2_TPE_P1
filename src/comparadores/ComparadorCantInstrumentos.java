package comparadores;

import java.util.Comparator;

import produ.ElementoConcurso;

public class ComparadorCantInstrumentos implements Comparator<ElementoConcurso> {
    @Override
    public int compare(ElementoConcurso e1, ElementoConcurso e2) {
        return e1.getInstrumentos().size() - e2.getInstrumentos().size();
    }
}
