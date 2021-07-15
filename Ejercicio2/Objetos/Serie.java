package Objetos;

import Interface.Entregable;

public class Serie implements Entregable {

	// Atributos
	private String titulo;
	private int numTemps;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemps() {
		return numTemps;
	}
	public void setNumTemps(int numTemps) {
		this.numTemps = numTemps;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemps=" + numTemps + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
	// Constructores
	public Serie() {
		this.numTemps = 3;
		this.entregado = false;
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemps = 3;
		this.entregado = false;
	}
		
	public Serie(String titulo, int numTemps, String genero, String creador) {
		this.titulo = titulo;
		this.numTemps = numTemps;
		this.genero = genero;
		this.creador = creador;
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
	
	public void compareTo(Object a ) {
		if (a instanceof Serie) {
			System.out.println("La serie tiene " + this.numTemps + " temporadas, la serie a comparar tiene " + ((Serie) a).getNumTemps());
		}
	}
}
