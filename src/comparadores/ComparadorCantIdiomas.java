package comparadores;

import java.util.Comparator;

import produ.ElementoConcurso;

public class ComparadorCantIdiomas implements Comparator<ElementoConcurso> {
    @Override
    public int compare(ElementoConcurso e1, ElementoConcurso e2) {
        return e1.getIdiomas().size() - e2.getIdiomas().size();
    }
}
