package ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions;

/**
 * 
 * @author Enrique Sanchez-Migallon
 *
 */
public class AngulosValidosException extends RuntimeException {

	/**
	 * Excepcion personalizada para el tipo de angulo
	 * 
	 * @param errorMessage en formato string el error
	 */
	public AngulosValidosException(String errorMessage) {
		super(errorMessage);
	}

}
