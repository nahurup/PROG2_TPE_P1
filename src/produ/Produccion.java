package produ;
import produ.criterios.Criterios;

import java.util.ArrayList;
import java.util.List;

import static produ.criterios.Criterios.*;

public class Produccion {
	//Atributos
	private ArrayList<Jurado> jurados;
	
    public static void main(String[] args) {
    	Jurado j1 = new Jurado();
    	Participante p1 = new Participante("juan", "perez", 28);
    	p1.addGeneroMusical("bamba");
    	p1.addIdioma("ingles");
    	p1.addInstrumento("guitarra");
    	Participante p2 = new Participante("marcos", "perez", 16);
    	p2.addGeneroMusical("cumbia");
    	p2.addIdioma("japones");
    	p2.addInstrumento("bongoes");
    	Participante p3 = new Participante("marcelo", "perez", 38);
    	p3.addGeneroMusical("rock");
    	p3.addIdioma("español");
    	p3.addInstrumento("piano");
    	j1.agregarParticipante(p1);
    	j1.agregarParticipante(p2);
    	j1.agregarParticipante(p3);

        List<Participante> resultado = new ArrayList<>();
        
        resultado = j1.getEquipo();
        
        System.out.println(resultado);

        System.out.println(Criterios.and(sabeIdioma("ingles"), tieneGenero("ingles")).filter(resultado));
        System.out.println(Criterios.or(sabeIdioma("ingles"), mayorDe(30)).filter(resultado));
        System.out.println(Criterios.not(sabeIdioma("ingles")).filter(resultado));
    }
}
