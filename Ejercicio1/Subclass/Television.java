package Subclass;

import Padres.Electrodomestico;

public class Television extends Electrodomestico {

	// Atributos
	private int resolucion;
	private boolean tdt;
	
	// Constantes
	private int RESOLUCION = 20;
	private boolean TDT = false;
	
	// Getters y setters
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTdt() {
		return tdt;
	}
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + ", RESOLUCION=" + RESOLUCION + ", TDT=" + TDT
				+ ", precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnerg + ", peso="
				+ peso + "]";
	}
	
	// Constructores
	public Television() {
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	public Television (int precioBase, int peso) {
		super (precioBase, peso);
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}	
	public Television(int precioBase, String color, char consumoEnerg, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	// Metodos
	public int precioFinal() {
		precioBase = super.precioFinal();
		if (resolucion > 40) {
			precioBase += super.getPrecioBase() * 30 / 100;
		}
		if (tdt) {
			precioBase += 50;
		}
		
		return precioBase;
	}
	

	
}
