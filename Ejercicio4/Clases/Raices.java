package Clases;

public class Raices {

	// Atributos
	private double a;
	private double b;
	private double c;
	
	// Constructores
	public Raices() {
		this(0,0,0);
	}
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Getters setters
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	// Metodos (son todos private menos uno porque no los tiene que ver el usuario)
	// Devuelve el discriminante
	private double getDescriminante() {
		double discriminante = 0;
		
		discriminante = Math.pow(b, 2) - (4 * a *c);
		
		return discriminante;
	}
	// Para saver si tiene 2 soluciones, true tiene 2, false no tiene 2
	private boolean tieneRaices() {
		return (getDescriminante() > 0);
	}
	// Para saver si tiene 1 solucion, true tiene 1, false no tiene 1
	private boolean tieneRaiz() {
		return (getDescriminante() == 0);
	}
	// Para decir cuantas soluciones tiene y en funcion de eso mostrar 1 resultado o 2 (este metodo es publico, lo usara el user)
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		}
		else if (tieneRaiz()) {
			obtenerRaiz();
		}
		else {
			System.out.println("No tiene solucion");
		}
	}
	// Para calcular la raiz con dos soluciones
	private void obtenerRaices() {
		double sol1 = ((-b + Math.sqrt(getDescriminante())) / (2 * a));
		double sol2 = ((-b - Math.sqrt(getDescriminante())) / (2 * a));
		
		System.out.println("Solucion 1: " + sol1);
		System.out.println("Solucion 2: " + sol2);
	}
	// Para calcular la raiz con dos soluciones
	private void obtenerRaiz() {
		double sol1 = -b / (2 * a); // Como aqui solo entrara si el descriminante es 0, su raiz cuadrada no importa... la obviamos
		
		System.out.println("Solucion: " + sol1);
	}
	
}
