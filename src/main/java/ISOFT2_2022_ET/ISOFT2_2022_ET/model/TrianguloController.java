package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

public class TrianguloController {

	public static void tipoDeTriangulo(Triangulo t) {

		if ((t.getAngulo1() + t.getAngulo2() + t.getAngulo3()) > 180) {
			throw new RuntimeException("Angulos no validos");
		}

		if (Math.pow(t.getAngulo3(), 2) != (Math.pow(t.getAngulo1(), 2) + Math.pow(t.getAngulo2(), 2))) {
			throw new RuntimeException("Lados no validos");
		}

		// Ifs para comprobar que tipo es segun los lados
		if (t.getLado1() == t.getLado2() && t.getLado1() == t.getLado3()) {
			System.out.println("Triangulo Equilatero.");
		} else if (t.getLado1() != t.getLado2() && t.getLado1() != t.getLado3() && t.getLado2() != t.getLado3()) {
			System.out.println("Triangulo Escaleno.");
		} else {
			System.out.println("Triangulo Isosceles.");
		}
		// Ifs para comprobar que tipo es segun los angulos
		if (t.getAngulo1() == 90 || t.getAngulo2() == 90 || t.getAngulo3() == 90) {
			System.out.println("Triangulo Rectangulo.");
		} else if (t.getAngulo1() < 90 && t.getAngulo2() < 90 && t.getAngulo3() < 90) {
			System.out.println("Triangulo Acutangulo.");
		} else {
			System.out.println("Triangulo Obstusangulo.");
		}
	}

}
