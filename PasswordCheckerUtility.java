/**
 * Password Checker Utility checks if the password meets valid password standards
 * @author Shenabeth Jenkins
 * 
 */
import java.util.ArrayList;

public class PasswordCheckerUtility {

	//constructor
	/**
	 * no argument constructor
	 */
	PasswordCheckerUtility(){
		//no arg
	}


	//methods
	/**
	 * Return true if valid, returns false if an invalid password
	 * @param passwordString
	 * @return if the password is valid
	 * @throws LengthException
	 * @throws NoDigitException
	 * @throws NoUpperAlphaException
	 * @throws NoLowerAlphaException
	 * @throws InvalidSequenceException
	 */
	public static boolean isValidPassword(String passwordString) throws LengthException, NoDigitException, 
	NoUpperAlphaException, NoLowerAlphaException, InvalidSequenceException {
		//declare variables
		int counter = 1;
		boolean digit = false, invalidSequence = false;
		char x = passwordString.charAt(0);

		//loop through the password
		for (int i = 0; i < passwordString.length(); i++) {
			//check for a digit from 0 to 9 (1,2,3,4,5,6,7,8,9,0)
			if (passwordString.charAt(i) == '1' || passwordString.charAt(i) == '2' || passwordString.charAt(i) == '3' || 
					passwordString.charAt(i) == '4' || passwordString.charAt(i) == '5' || passwordString.charAt(i) == '6' ||
					passwordString.charAt(i) == '7' || passwordString.charAt(i) == '8' || passwordString.charAt(i) == '9' || 
					passwordString.charAt(i) == '0') 
				//true if digit is found
				digit = true;

			//check for invalid character sequence
			if (passwordString.charAt(i) == x && i > 0) counter++;
			else {
				counter = 1;
				x = passwordString.charAt(i);
			}

			//invalid sequence is true if there are more than 2 of the same character
			if (counter > 2) invalidSequence = true;
		}


		//throws exception based on criteria
		//length
		if (passwordString.length() < 6) throw new LengthException();

		//digit
		else if (digit == false) throw new NoDigitException();

		//no upper case letter
		else if (passwordString.equals(passwordString.toLowerCase()))throw new NoUpperAlphaException();

		//no lower case letter
		else if (passwordString.equals(passwordString.toUpperCase())) throw new NoLowerAlphaException();

		//invalid sequence (more than 2 of the same character
		else if (invalidSequence == true) throw new InvalidSequenceException();

		//otherwise, valid password
		else return true;
	}


	/**
	 * Return true if length of password is greater or equal to 6 but less than or equal to 9
	 * @param passwordString
	 * @return
	 * @throws NoLowerAlphaException 
	 * @throws NoUpperAlphaException 
	 * @throws NoDigitException 
	 * @throws LengthException 
	 * @throws InvalidSequenceException 
	 */
	public static boolean isWeakPassword(String passwordString) throws LengthException, NoDigitException, NoUpperAlphaException, NoLowerAlphaException, InvalidSequenceException {
		//use a method to check the password
		isValidPassword(passwordString);

		//if the password meets length standards, return true (weak password)
		if (passwordString.length() >= 6 && passwordString.length() <= 9) return true;

		//otherwise it is a strong password
		else return false;
	}


	/**
	 * Returns an array list of invalid passwords (weak passwords are not considered invalid)
	 * @param passwords
	 * @return invalid password array list
	 */
	public static ArrayList<String> validPasswords(ArrayList<String> passwords) {
		//declare variables
		ArrayList<String> invalidPasswords = new ArrayList<String>();

		//loop
		for (int i = 0; i < passwords.size(); i++) {
			//try block
			try {
				PasswordCheckerUtility.isValidPassword(passwords.get(i));
			}

			//length
			catch (LengthException e) {invalidPasswords.add(passwords.get(i) + " " + e.getMessage() + ".");}

			//digit
			catch (NoDigitException e) {invalidPasswords.add(passwords.get(i) + " " + e.getMessage() + ".");}

			//no upper case
			catch (NoUpperAlphaException e) {invalidPasswords.add(passwords.get(i) + " " + e.getMessage() + ".");}

			//no lower case
			catch (NoLowerAlphaException e) {invalidPasswords.add(passwords.get(i) + " " + e.getMessage() + ".");}

			//invalid sequence
			catch (InvalidSequenceException e) {invalidPasswords.add(passwords.get(i) + " " + e.getMessage());}
		}

		//return the invalid passwords array
		return invalidPasswords;
	}

}
