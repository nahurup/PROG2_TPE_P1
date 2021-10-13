package produ.criterios;


public abstract class CriterioBinario implements Criterio {

    private Criterio a;
    private Criterio b;

    public CriterioBinario(Criterio a, Criterio b) {
        this.a = a;
        this.b = b;
    }

    public Criterio getA() {
        return a;
    }

    public Criterio getB() {
        return b;
    }
}

