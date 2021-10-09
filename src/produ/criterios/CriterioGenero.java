package produ.criterios;

import produ.Participante;

public class CriterioGenero extends Criterio {
    private String genero;

    public CriterioGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.tieneGenero(genero);
    }
}