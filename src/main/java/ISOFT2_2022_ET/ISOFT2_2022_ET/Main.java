package ISOFT2_2022_ET.ISOFT2_2022_ET;

import java.util.Scanner;

import ISOFT2_2022_ET.ISOFT2_2022_ET.model.Triangulo;
import ISOFT2_2022_ET.ISOFT2_2022_ET.model.TrianguloController;

public class Main {

	public static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {

		int lado1, lado2, lado3, angulo1, angulo2, angulo3;

		try {
		/* Y UNA FUNCIONCITA PARA LEER ENTEROS DE TECLADO??*/ 
			System.out.println("Lado 1");
			lado1 = TECLADO.nextInt();

			System.out.println("Lado 2");
			lado2 = TECLADO.nextInt();

			System.out.println("Lado 3");
			lado3 = TECLADO.nextInt();

			System.out.println("Angulo 1");
			angulo1 = TECLADO.nextInt();

			System.out.println("Angulo 2");
			angulo2 = TECLADO.nextInt();

			System.out.println("Angulo 3");
			angulo3 = TECLADO.nextInt();
/* TODO ESTO METELO EN EL CONSTRUCTOR */
			if (lado1 < 0 || lado2 < 0 || lado3 < 0 || angulo1 < 0 || angulo2 < 0 || angulo2 < 0) {
				throw new Exception();
			}

			Triangulo t1 = new Triangulo(lado1, lado2, lado3, angulo1, angulo2, angulo3);
			TrianguloController.tipoDeTriangulo(t1);

		} catch (Exception e) {
			System.out.println("No se pueden introducir caracteres o numeros negativos");
		}

	}
}
