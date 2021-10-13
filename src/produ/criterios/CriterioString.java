package produ.criterios;

import produ.Participante;

public abstract class CriterioString implements Criterio {

    private String palabra;

    public CriterioString(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }
}