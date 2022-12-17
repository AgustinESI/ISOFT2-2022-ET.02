package ISOFT2_2022_ET.ISOFT2_2022_ET;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ISOFT2_2022_ET.ISOFT2_2022_ET.model.Triangulo;
import ISOFT2_2022_ET.ISOFT2_2022_ET.model.TrianguloController;

public class Main {

	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static final TrianguloController tipoController = new TrianguloController();

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		String[] messages = { "Lado 1", "Lado 2", "Lado 3", "Angulo 1", "Angulo 2", "Angulo 3" }; for (int i = 0; i < messages.length; i++) {
		System.out.println(messages[i]); list.add(leerEnteros()); }
		Triangulo t = new Triangulo(); t.setLado1(list.get(0));
		t.setLado2(list.get(1)); t.setLado3(list.get(2)); t.setAngulo1(list.get(3));
		t.setAngulo2(list.get(4));
		t.setAngulo3(list.get(5));
		tipoController.tipoDeTriangulo(t);
	}

	private static int leerEnteros() {
		Integer value = null;
		try {
			value = TECLADO.nextInt();
		} catch (Exception e) {
			System.out.println("No se pueden introducir caracteres");
		}

		return value;
	}
}
