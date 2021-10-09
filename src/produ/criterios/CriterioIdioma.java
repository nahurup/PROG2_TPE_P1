package produ.criterios;

import produ.Participante;

public class CriterioIdioma extends Criterio {
    private String idioma;

    public CriterioIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.tieneIdioma(idioma);
    }
}