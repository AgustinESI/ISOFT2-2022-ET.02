package ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions;

/**
 * 
 * @author Enrique Sanchez-Migallon
 *
 */
public class NumerosValidosException extends RuntimeException {
	/**
	 * Excepcion personalizada para el tipo de angulo
	 * 
	 * @param errorMessage en formato string el error
	 */
	public NumerosValidosException(String errorMessage) {
		super(errorMessage);
	}

}
