package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.AngulosValidosException;
import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;

/**
 * 
 * @author Enrique Sanchez-Migallon
 *
 */
public class TrianguloController {

	/**
	 * Constructor vacio de la clase TrianguloController
	 */
	public TrianguloController() {
		super();
	}

	/**
	 * Comprueba el tipo de triangulo introducido lanzando excepciones en caso de error
	 * @param triangulo
	 * @return retorna en formato String el tipo de triangulo introducido
	 */
	public String tipoDeTriangulo(Triangulo t) {
		String result = "";
		// Ifs para comprobar que los valroes no sean negativos y 0
		if (t.getLado1() <= 0 || t.getLado2() <= 0 || t.getLado3() <= 0 || t.getAngulo1() <= 0 || t.getAngulo2() <= 0 || t.getAngulo3() <= 0) {
			throw new NumerosValidosException("Numeros negativos no validos");
		}

		// Ifs para comprobar que cumpla la condicion de triangulo
		if ((t.getAngulo1() + t.getAngulo2() + t.getAngulo3()) > 180) {
			throw new AngulosValidosException("Angulos no validos");
		}

		// Ifs para comprobar que tipo es segun los lados
		if (t.getLado1() == t.getLado2() && t.getLado1() == t.getLado3()) {
			result += "Equilatero ";
		} else if (t.getLado1() != t.getLado2() && t.getLado1() != t.getLado3() && t.getLado2() != t.getLado3()) {
			result += "Escaleno ";
		} else {
			result += "Isosceles ";
		}
		// Ifs para comprobar que tipo es segun los angulos
		if (t.getAngulo1() == 90 || t.getAngulo2() == 90 || t.getAngulo3() == 90) {
			result += "Rectangulo";
		} else if (t.getAngulo1() < 90 && t.getAngulo2() < 90 && t.getAngulo3() < 90) {
			result += "Acutangulo";
		} else {
			result += "Obstusangulo";
		}
		return result;
	}

}
