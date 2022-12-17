package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.AngulosValidosException;
import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;

/**
 * Clase triangulo
 * 
 * @author Agustin Sanchez
 *
 */
public class Triangulo {
	int lado1;
	int lado2;
	int lado3;
	int angulo1;
	int angulo2;
	int angulo3;

	/**
	 * Constructor vacio
	 */
	public Triangulo() {
		super();
	}

	/**
	 * Metodo getter del lado1
	 * 
	 * @return el valor del lado1
	 */
	public int getLado1() {
		return lado1;
	}

	/**
	 * 
	 * @param lado1 valor para settear el primer lado del triangulo
	 */
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Metodo getter del lado2
	 * 
	 * @return el valor del lado2
	 */
	public int getLado2() {
		return lado2;
	}

	/**
	 * 
	 * @param lado1 valor para settear el segundo lado del triangulo
	 */
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Metodo getter del lado3
	 * 
	 * @return el valor del lado3
	 */
	public int getLado3() {
		return lado3;
	}

	/**
	 * 
	 * @param lado1 valor para settear el tercer lado del triangulo
	 */
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Metodo getter del angulo1
	 * 
	 * @return el valor del angulo1
	 */
	public int getAngulo1() {
		return angulo1;
	}

	/**
	 * 
	 * @param lado1 valor para settear el primer angulo del triangulo
	 */
	public void setAngulo1(int angulo1) {
		this.angulo1 = angulo1;
	}

	/**
	 * Metodo getter del angulo2
	 * 
	 * @return el valor del angulo2
	 */
	public int getAngulo2() {
		return angulo2;
	}

	/**
	 * 
	 * @param lado1 valor para settear el segundo angulo del triangulo
	 */
	public void setAngulo2(int angulo2) {
		this.angulo2 = angulo2;
	}

	/**
	 * Metodo getter del angulo3
	 * 
	 * @return el valor del angulo3
	 */
	public int getAngulo3() {
		return angulo3;
	}

	/**
	 * 
	 * @param lado1 valor para settear el tercer angulo del triangulo
	 */
	public void setAngulo3(int angulo3) {
		this.angulo3 = angulo3;
	}

	/**
	 * Comprueba el tipo de triangulo introducido lanzando excepciones en caso de error
	 * @param triangulo
	 * @return retorna en formato String el tipo de triangulo introducido
	 */
	public String tipoDeTriangulo() {
		String result = "";
		// Ifs para comprobar que los valroes no sean negativos y 0
		if (getLado1() <= 0 || getLado2() <= 0 || getLado3() <= 0 || getAngulo1() <= 0 || getAngulo2() <= 0 || getAngulo3() <= 0) {
			throw new NumerosValidosException("Numeros negativos no validos");
		}

		// Ifs para comprobar que cumpla la condicion de triangulo
		if ((getAngulo1() + getAngulo2() + getAngulo3()) > 180) {
			throw new AngulosValidosException("Angulos no validos");
		}

		// Ifs para comprobar que tipo es segun los lados
		if (getLado1() == getLado2() && getLado1() == getLado3()) {
			result += "Equilatero ";
		} else if (getLado1() != getLado2() && getLado1() != getLado3() && getLado2() != getLado3()) {
			result += "Escaleno ";
		} else {
			result += "Isosceles ";
		}
		// Ifs para comprobar que tipo es segun los angulos
		if (getAngulo1() == 90 || getAngulo2() == 90 || getAngulo3() == 90) {
			result += "Rectangulo";
		} else if (getAngulo1() < 90 && getAngulo2() < 90 && getAngulo3() < 90) {
			result += "Acutangulo";
		} else {
			result += "Obstusangulo";
		}
		return result;
	}
	
}
