package ISOFT2_2022_ET.ISOFT2_2022_ET;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;
import ISOFT2_2022_ET.ISOFT2_2022_ET.model.Triangulo;
import ISOFT2_2022_ET.ISOFT2_2022_ET.model.TrianguloController;

public class TrianguloTest {
	TrianguloController trianguloController;

	@Before
	public void instanciarTrianguloController() {
		trianguloController = new TrianguloController();
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp1() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(0);
		triangulo.setLado3(0);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp2() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(0);
		triangulo.setLado3(0);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(90);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp3() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(0);
		triangulo.setLado3(0);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(90);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp4() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(0);
		triangulo.setLado3(0);
		triangulo.setAngulo1(90);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp5() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(0);
		triangulo.setLado3(5);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp6() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(0);
		triangulo.setLado2(5);
		triangulo.setLado3(0);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test(expected = NumerosValidosException.class)
	public void cdp7() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(0);
		triangulo.setLado3(0);
		triangulo.setAngulo1(0);
		triangulo.setAngulo2(0);
		triangulo.setAngulo3(0);
		trianguloController.tipoDeTriangulo(triangulo);
	}

	@Test()
	public void cdp8() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(7);
		triangulo.setLado3(5);
		triangulo.setAngulo1(60);
		triangulo.setAngulo2(60);
		triangulo.setAngulo3(60);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Isosceles Acutangulo");
	}

	@Test()
	public void cdp9() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(5);
		triangulo.setLado3(8);
		triangulo.setAngulo1(45);
		triangulo.setAngulo2(45);
		triangulo.setAngulo3(90);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Isosceles Rectangulo");
	}

	@Test()
	public void cdp10() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(5);
		triangulo.setLado3(5);
		triangulo.setAngulo1(45);
		triangulo.setAngulo2(90);
		triangulo.setAngulo3(45);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Equilatero Rectangulo");
	}

	@Test()
	public void cdp11() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(7);
		triangulo.setLado2(5);
		triangulo.setLado3(5);
		triangulo.setAngulo1(90);
		triangulo.setAngulo2(45);
		triangulo.setAngulo3(45);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Isosceles Rectangulo");
	}

	@Test()
	public void cdp12() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(6);
		triangulo.setLado3(7);
		triangulo.setAngulo1(60);
		triangulo.setAngulo2(60);
		triangulo.setAngulo3(60);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Escaleno Acutangulo");
	}

	@Test()
	public void cdp13() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(6);
		triangulo.setLado3(7);
		triangulo.setAngulo1(30);
		triangulo.setAngulo2(30);
		triangulo.setAngulo3(120);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Escaleno Obstusangulo");
	}

	@Test()
	public void cdp14() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(6);
		triangulo.setLado3(7);
		triangulo.setAngulo1(30);
		triangulo.setAngulo2(120);
		triangulo.setAngulo3(30);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Escaleno Obstusangulo");
	}

	@Test()
	public void cdp15() {
		Triangulo triangulo = new Triangulo();
		triangulo.setLado1(5);
		triangulo.setLado2(6);
		triangulo.setLado3(7);
		triangulo.setAngulo1(120);
		triangulo.setAngulo2(30);
		triangulo.setAngulo3(30);
		assertEquals(trianguloController.tipoDeTriangulo(triangulo), "Escaleno Obstusangulo");
	}

}
