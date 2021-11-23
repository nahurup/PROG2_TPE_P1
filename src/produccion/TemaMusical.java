package produccion;
import java.util.ArrayList;
import produccion.criterios.Criterio;

public class TemaMusical {
	private String titulo;
	private String idioma;
	private ArrayList<String> generos;
	private ArrayList<String> instrumentosImplementados;
	private Criterio Estrategia;
	
	public TemaMusical (String titulo, String idioma, Criterio estrategia) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.Estrategia = estrategia;
	}
	
	public void setEstrategia (Criterio E) {
		this.Estrategia = E;
	}
	
	public void addGenero (String genero) {
		this.generos.add(genero);
	}
	public void addInstrumento (String instr) {
		this.instrumentosImplementados.add(instr);
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	public String getIdioma () {
		return this.idioma;
	}
	public Criterio getEstrategia () {
		return this.Estrategia;
	}
	public ArrayList<String> getGeneros () {
		ArrayList<String> copia = new ArrayList<>(this.generos);
		return copia;
	}
	public ArrayList<String> getInstrumentos () {
		ArrayList<String> copia = new ArrayList<>(this.instrumentosImplementados);
		return copia;
	}
	public Boolean puedeInterpretarlo (ElementoConcurso mimebro) {
		return this.Estrategia.cumpleConCriterio(mimebro);
	}
	
}
