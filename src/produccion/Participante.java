package produccion;
import java.util.ArrayList;

import produccion.criterios.Criterio;

public class Participante extends ElementoConcurso{

	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	//Constructor
	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicales = new ArrayList<>();;
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	//Metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public ArrayList<String> getGeneros() {
		ArrayList<String> copia = new ArrayList<>(this.generosMusicales);
		return copia;
	}
	
	public ArrayList<String> getIdiomas() {
		ArrayList<String> copia = new ArrayList<>(this.idiomas);
		return copia;
	}
	
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> copia = new ArrayList<>(this.instrumentos);
		return copia;
	}
	
	public void addGeneroMusical(String genero) {
        if (!generosMusicales.contains(genero))
            this.generosMusicales.add(genero);
	}
	
	public void addIdioma(String idioma) {
		if(!idiomas.contains(idioma)) {
			this.idiomas.add(idioma);
		}
	}
	
	public void addInstrumento(String instrumento) {
		if(!instrumentos.contains(instrumento)) {
			this.instrumentos.add(instrumento);
		}
	}
	
	
    @Override
    public String toString() {
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

	@Override
	public ArrayList<ElementoConcurso> busqueda(Criterio C) {
		ArrayList<ElementoConcurso> resultado = new ArrayList<>();
		if (C.cumpleConCriterio(this)) {
			resultado.add(this);
		}
		return resultado;	
	}

	
}
