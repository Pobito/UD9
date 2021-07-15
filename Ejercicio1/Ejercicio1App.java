import Padres.Electrodomestico;
import Subclass.Lavadora;
import Subclass.Television;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pTotal = 0, pLava = 0, pTele = 0, i;
		Electrodomestico[] array = new Electrodomestico[10];
		
		array[0] = new Lavadora(200, "rojo", 'B', 15, 20);
		array[1] = new Television(300, "negro", 'A', 10, 32, false);
		array[2] = new Lavadora(150, "negro", 'A', 100, 50);
		array[3] = new Television(400, "blanco", 'B', 20, 55, true);
		array[4] = new Lavadora(350, "azul", 'C', 22, 25);
		array[5] = new Television(150, "gris", 'F', 12, 22, true);
		array[6] = new Lavadora(350, "blanco", 'A', 33, 20);
		array[7] = new Television(200, "rojo", 'D', 15, 32, false);
		array[8] = new Lavadora(280, "gris", 'E', 30, 28);
		array[9] = new Television(250, "negro", 'A', 10, 28, false);
		
		for (i = 0; i < array.length; i++) {
			int precio = array[i].precioFinal();
			if (array[i] instanceof Lavadora) {
				pLava += precio;
			}
			if (array[i] instanceof Television) {
				pTele += precio;
			}
			pTotal += precio;
		}
		
		System.out.println("Precio lavadoras: " + pLava);
		System.out.println("Precio televisores: " + pTele);
		System.out.println("Precio TOTAL: " + pTotal);
		
	}

}
