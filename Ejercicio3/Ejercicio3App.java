import Objetos.Libro;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro ("SIDJ39", "Don Quijote", "Cervantes", 853);
		Libro libro2 = new Libro ("DFJSD542", "El buen libro de mates", "Yo", 153);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		compararPaginas(libro1, libro2);
		
	}

	// Para comparar las paginas
	public static void compararPaginas (Libro a, Libro b) {
		if (a.getnPaginas() > b.getnPaginas()) {
			System.out.println(a.getTitulo() + " tiene mas páginas que " + b.getTitulo());
		}
		else {
			System.out.println(b.getTitulo() + " tiene mas páginas que " + a.getTitulo());
		}
	}
}
