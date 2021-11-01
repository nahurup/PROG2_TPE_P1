package comparadores;

import java.util.Comparator;

import produ.ElementoConcurso;

public class ComparadorEdad implements Comparator<ElementoConcurso> {
    @Override
    public int compare(ElementoConcurso e1, ElementoConcurso e2) {
        return e1.getEdad() - e2.getEdad();
    }
}
