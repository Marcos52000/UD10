package Interfaz;

import javax.swing.JOptionPane;

public class pedirDatos {

	public static void menu() {
		System.out.println("-------MENU-------");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Potencia");
		System.out.println("5: Raiz Cuadrada");
		System.out.println("6: Raiz Cubica");
		System.out.println("7: Division");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion"));
		switch (opcion) {
		case 1:
			Clases.Operecion.suma();
			break;

		case 2:
			Clases.Operecion.resta();
			break;
		case 3:
			Clases.Operecion.multiplicar();
			break;
		case 4:
			Clases.Operecion.potencia();
			break;
		case 5:
			Clases.Operecion.raizCuadrada();
			break;
		case 6:
			Clases.Operecion.raizCubica();
			break;
		case 7:
			Clases.Operecion.dividir();
			break;
		default:
			break;
		}
	}

}
