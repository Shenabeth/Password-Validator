/**
 * NoDigitException when there is no digit in the password
 * @author Shenabeth Jenkins
 *
 */
public class NoDigitException extends Exception {
	/**
	 * no arg constructor
	 */
	public NoDigitException () {
		//no digit exception message
		super("The password must contain at least one digit");
	}
}
