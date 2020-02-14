/**
 * NoLowerAlphaException when there is no lower case letter
 * @author Shenabeth Jenkins
 *
 */
public class NoLowerAlphaException extends Exception {
	/**
	 * No arg constructor
	 */
	public NoLowerAlphaException () {
		//no lower case letter exception message
		super("The password must contain at least one lowercase alphabetic character");
	}
}
