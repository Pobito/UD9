package Padres;

public class Electrodomestico {

	// Atributos
	protected int precioBase;
	protected String color;
	protected char consumoEnerg;
	protected int peso;
	
	// Valores por defecto en constantes
	private final int PRECIO = 100;
	private final String COLOR = "blanco";
	private final char CONSUMO = 'F';
	private final int PESO = 5;
	
	// Getters y setter
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnerg() {
		return consumoEnerg;
	}
	public void setConsumoEnerg(char consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnerg
				+ ", peso=" + peso + "]";
	}
	
	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
		
	public Electrodomestico(int precioBase, String color, char consumoEnerg, int peso) {
		this.precioBase = precioBase;
		this.color = comprovarColor(color);
		this.consumoEnerg = comprovarConsumo(consumoEnerg);
		this.peso = peso;
	}
	// Para comprovar el color
	private String comprovarColor (String color) {
		String colorF = COLOR;
			
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			colorF = color;
		}
		
		return colorF;
	}
		
	// Para comprovar el consumo energetico
	private char comprovarConsumo (char consumo) {
		switch (consumo) {
			case ('A'):
				break;
			case ('B'):
				break;
			case ('C'):
				break;
			case ('D'):
				break;
			case ('E'):
				break;
			case ('F'):
				break;
			default:
				consumo = 'F';
		}
		return consumo;
	}
	
	// Para el precio final
	public int precioFinal() {
		
		// Aumento en funcion del consumo
		switch (consumoEnerg) {
			case ('A'):
				precioBase += 100;
				break;
			case ('B'):
				precioBase += 80;
				break;
			case ('C'):
				precioBase += 60;
				break;
			case ('D'):
				precioBase += 50;
				break;
			case ('E'):
				precioBase += 30;
				break;
			case ('F'):
				precioBase += 10;
				break;
		}
		
		// Aumento en funcion del peso
		if (peso < 20) {
			precioBase += 10;
		}
		else if (this.peso < 50) {
			precioBase += 50;
		}
		else if (this.peso < 80) {
			precioBase += 80;
		}
		else {
			precioBase += 100;
		}
				
		return precioBase;
	}
}
