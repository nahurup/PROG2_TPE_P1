package produ;
import java.util.ArrayList;
import java.util.Comparator;

import produ.criterios.Criterio;

public class Participante extends ElementoConcurso {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	//Constructor
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicales = new ArrayList<>();;
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	@Override
    public ArrayList<ElementoConcurso> participantesCon(Criterio cr) {
        ArrayList<ElementoConcurso> participantes = new ArrayList<>();
        if (cr.cumpleConCriterio(this))
            participantes.add(this);
        return participantes;
    }
	
	@Override
	public boolean cumpleCon(Criterio cr) {
		if (cr.cumpleConCriterio(this))
			return true;
		else
			return false;
	}
	
	//Metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	@Override
	public int getEdad() {
		return this.edad;
	}
	
	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> copia = new ArrayList<>(this.generosMusicales);
		return copia;
	}
	
	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> copia = new ArrayList<>(this.idiomas);
		return copia;
	}
	
	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> copia = new ArrayList<>(this.instrumentos);
		return copia;
	}
	
	public void addGenerosMusicales(ArrayList<String> generos) {
        if (!generosMusicales.contains(generos))
            this.generosMusicales.addAll(generos);
	}
	
	public void addIdiomas(ArrayList<String> idiomas) {
		if(!idiomas.contains(idiomas)) {
			this.idiomas.addAll(idiomas);
		}
	}
	
	public void addInstrumentos(ArrayList<String> instrumentos) {
		if(!instrumentos.contains(instrumentos)) {
			this.instrumentos.addAll(instrumentos);
		}
	}
	
    @Override
    public ElementoConcurso copia(){
    	Participante p = new Participante(this.getNombre(),
                this.getApellido(),
                this.getEdad());
    	p.addGenerosMusicales(this.generosMusicales);
    	p.addIdiomas(this.idiomas);
    	p.addInstrumentos(this.instrumentos);
    	
    	return p;
    }

    @Override
    public ElementoConcurso copia(Criterio cr){
        if (cr.cumpleConCriterio(this)) {
        	Participante p = new Participante(this.getNombre(),
                    this.getApellido(),
                    this.getEdad());
        	p.addGenerosMusicales(this.generosMusicales);
        	p.addIdiomas(this.idiomas);
        	p.addInstrumentos(this.instrumentos);
        	
        	return p;
        }
        else
            return null;
    }
	
    @Override
    public String toString() {
    	//agregar listas
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}'+"\n";
    }
	
    @Override
    public boolean equals(Object o) {
        try {
            Participante that = (Participante) o;
            return this.getNombre().equals(that.getNombre()) &&
            		this.getApellido().equals(that.getApellido());
        } catch (Exception e){
            return false;
        }
    }
}
