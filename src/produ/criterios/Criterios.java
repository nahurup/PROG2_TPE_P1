package produ.criterios;


public class Criterios {

    public static Criterio tocaInstrumento(String instrumento) {
        return new CriterioInstrumento(instrumento);
    }

    public static Criterio sabeIdioma(String idioma) {
        return new CriterioIdioma(idioma);
    }

    public static Criterio tieneGenero(String genero) {
        return new CriterioGenero(genero);
    }

    public static Criterio mayorDe(int edad) {
        return new CriterioEdad(edad);
    }
    
    public static Criterio not(Criterio criterio) {
        return new CriterioNot(criterio);
    }

    public static Criterio and(Criterio a, Criterio b) {
        return new CriterioAnd(a, b);
    }

    public static Criterio or(Criterio a, Criterio b) {
        return new CriterioOr(a, b);
    }
}