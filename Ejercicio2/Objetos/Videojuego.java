package Objetos;

import Interface.Entregable;

public class Videojuego implements Entregable{

	// Atributos
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}
	// Constructores
	public Videojuego() {
		this.horas = 10;
		this.entregado = false;
	}
	public Videojuego (String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = false;
	}
	public Videojuego(String titulo, int horas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	public void entregar() {
		this.entregado = true;
	}
	
	public void devolver() {
		this.entregado = false;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void compareTo(Object a) {
		if (a instanceof Videojuego) {
			System.out.println("El videojuego " + this.horas + " horas, el videojuego a comparar tiene " + ((Videojuego) a).getHoras());
		}
	}
	
	
}
