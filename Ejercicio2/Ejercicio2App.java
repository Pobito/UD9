import Objetos.Serie;
import Objetos.Videojuego;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie[] serie1 = new Serie[3];
		Videojuego[] vj1 = new Videojuego[3];
		
		serie1[0] = new Serie("La casa de papel", 5, "Acción", "Netflix");
		serie1[1] = new Serie("Vikingos", 6, "Bélica", "Netflix");
		serie1[2] = new Serie("Elite", 4, "Misteri", "Netflix");
		
		vj1[0] = new Videojuego("Dark Souls", 20, "RPG", "Fromsoftware");
		vj1[1] = new Videojuego("Forza Horizon 4", 50, "Coches", "Microsoft");
		vj1[2] = new Videojuego("DEath Stranding", 20, "Simulador", "Kogima");
		
		serie1[0].entregar();
		serie1[2].entregar();
		vj1[1].entregar();
		
		
		System.out.println("Series entregadas:" + contar(serie1));
		System.out.println("Videojuegos entregados:" + contar(vj1));
		
		// La parte del compareTo no la termine de entender
		
	}

	// Metodos
	// Para contar las series entregadas
	public static int contar (Serie[] a) {
		int cont = 0, i;
		
		for (i = 0; i < a.length; i++) {
			if (a[i].isEntregado()) {
				cont++;
				System.out.println(a[i].toString());
			}
		}
		
		return cont;
	}
	// Para contar los videojuegos entregados
	public static int contar (Videojuego[] a) {
		int cont = 0, i;
		
		for (i = 0; i < a.length; i++) {
			if (a[i].isEntregado()) {
				cont++;
				System.out.println(a[i].toString());
			}
		}
		
		return cont;
	}
}
