/**
 * UnmatchedException when the 2 typed passwords don't match
 * @author Shenabeth Jenkins
 *
 */
public class UnmatchedException extends Exception {
	/**
	 * no arg constructor
	 */
	public UnmatchedException () {
		//unmatched exception message
		super("The passwords do not match");
	}
}
