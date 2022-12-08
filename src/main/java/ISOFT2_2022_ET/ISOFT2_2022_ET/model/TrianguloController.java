package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

public class TrianguloController {

	public static void tipoDeTriangulo(Triangulo t) {

		// Ifs para comprobar que los valroes no sean negativos y 0
		if (t.getLado1() <= 0 || t.getLado2() <= 0 || t.getLado3() <= 0 || t.getAngulo1() <= 0 || t.getAngulo2() <= 0 || t.getAngulo3() <= 0) {
			throw new RuntimeException("Numeros negativos no validos");
		}

		// Ifs para comprobar que cumpla la condicion de triangulo
		if ((t.getAngulo1() + t.getAngulo2() + t.getAngulo3()) > 180) {
			throw new RuntimeException("Angulos no validos");
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
