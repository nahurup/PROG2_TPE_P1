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
	//public String getNombre()
	//public String getApellido()
	//public int getEdad()
	//public boolean tieneIdioma(String idioma)
	//public boolean tieneGenero(String genero)
	//public boolean tieneInstrumento(String instrumento)
	public void addGenerosMusicales(String genero) {
        if (!generosMusicales.contains(genero))
            this.generosMusicales.add(genero);
	}
	//public void addIdiomas()
	//public void addInstrumentos()
}
