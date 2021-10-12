package produ;
import produ.criterios.Criterio;
import produ.criterios.CriterioEdad;
import produ.criterios.CriterioGenero;
import produ.criterios.CriterioIdioma;
import produ.criterios.CriterioInstrumento;

import java.util.ArrayList;

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
    	
    	System.out.println(j1.toString());


        ArrayList<Participante> resultado = new ArrayList<>();
        resultado = j1.seleccionarParticipantes(new CriterioEdad(15));
        resultado = j1.seleccionarParticipantes(new CriterioGenero("cumbia"));
        resultado = j1.seleccionarParticipantes(new CriterioIdioma("japones"));
        resultado = j1.seleccionarParticipantes(new CriterioInstrumento("bongoes"));
        
        System.out.println(resultado);
    }
}
