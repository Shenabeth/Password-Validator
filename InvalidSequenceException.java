/**
 * InvalidSequenceException when the password contains more than 2 of the same character in sequence
 * @author Shenabeth Jenkins
 *
 */
public class InvalidSequenceException extends Exception {
	/**
	 * no arg constructor
	 */
	public InvalidSequenceException () {
		//invalid sequence exception message
		super("The password cannot contain more than two of the same character in sequence");
	}
}
