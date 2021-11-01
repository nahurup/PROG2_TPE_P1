package comparadores;

import java.util.Comparator;

import produ.ElementoConcurso;

public class ComparadorCantGeneros implements Comparator<ElementoConcurso> {
    @Override
    public int compare(ElementoConcurso e1, ElementoConcurso e2) {
        return e1.getGeneros().size() - e2.getGeneros().size();
    }
}
