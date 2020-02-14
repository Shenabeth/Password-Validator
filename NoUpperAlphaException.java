/**
 * NoUpperAlphaException when there is no upper case letter
 * @author Shenabeth Jenkins
 *
 */
public class NoUpperAlphaException extends Exception {
	/**
	 * No arg constructor
	 */
	public NoUpperAlphaException () {
		//no upper case letter exception message
		super("The password must contain at least one uppercase alphabetic character");
	}
}
