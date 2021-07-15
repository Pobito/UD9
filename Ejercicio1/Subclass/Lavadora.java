package Subclass;

import Padres.Electrodomestico;

public class Lavadora extends Electrodomestico {

	// Atributos
	private int carga;
	
	// Constante
	private final int CARGA = 5;

	// Getters y setters
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color
				+ ", consumoEnerg=" + consumoEnerg + ", peso=" + peso + "]";
	}

	// Constructores
	public Lavadora () {
		this.carga = CARGA;
	}
	
	public Lavadora (int precioBase, int peso) {
		super (precioBase, peso);
		this.carga = CARGA;
	}
	public Lavadora(int precioBase, String color, char consumoEnerg, int peso, int carga) {
		super(precioBase, color, consumoEnerg, peso);
		this.carga = carga;
	}
	
	// Metodos
	public int precioFinal() {
		precioBase = super.precioFinal();
		if (carga > 30) {
			precioBase += 50;
		}

		return precioBase;
	}
	
}
