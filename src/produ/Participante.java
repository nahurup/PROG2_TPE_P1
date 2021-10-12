package produ;
import java.util.ArrayList;

public class Participante {
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
		ArrayList<String> lista_temp = new ArrayList<String>();
		lista_temp = this.generosMusicales;
		return lista_temp;
	}
	public ArrayList<String> getIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		lista_temp = this.idiomas;
		return lista_temp;
	}
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		lista_temp = this.instrumentos;
		return lista_temp;
	}
	public boolean tieneIdioma(String idioma) {
		if(idiomas.contains(idioma)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean tieneGenero(String genero) {
		if(generosMusicales.contains(genero)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean tieneInstrumento(String instrumento) {
		if(instrumentos.contains(instrumento)) {
			return true;
		}else {
			return false;
		}
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
}
