/**
 * LengthException when the length is lower than 6
 * @author Shenabeth Jenkins
 *
 */
public class LengthException extends Exception {
	
	/**
	 * No arg constructor
	 */
	public LengthException () {
		//length exception message
		super("The password must be at least 6 characters long");
	}
}
