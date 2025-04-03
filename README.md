# Password Validator

A tool for validating password strength and security requirements.

## Overview

This project implements a simple password validation system that checks user-provided passwords against multiple security criteria. The validator ensures passwords meet modern security standards while providing helpful feedback to users.

## Features

The password validator checks for the following criteria:

- **Minimum Length**: Passwords must be at least 6 characters long
- **Password Strength**: 
  - Strong: 10+ characters
  - Medium: 6-9 characters
- **Numeric Character**: At least one digit (0-9) is required
- **Uppercase Character**: At least one uppercase letter (A-Z) is required
- **Lowercase Character**: At least one lowercase letter (a-z) is required
- **Sequence Limitation**: No more than 2 identical characters in sequence
- **Password Matching**: Confirmation password must match the original password

## Algorithm

The validation process follows this pseudocode:

```
1. Start
2. User inputs a password (or loads a file)
3. Check password validation:
   a. Check for at least 6 characters
      i.   Loop through the string and add 1 to the counter every time.
      ii.  If the counter is lower than 6, it is not a valid password.
           - Show message: "The password must be at least 6 characters long"
   
   b. Check password strength
      i.   Loop through the string and add 1 to the counter every time.
      ii.  If the counter is 10 or higher, it is a strong message
      iii. If the counter is between 6 and 10, it is an OK password
           - Show message: "Password is OK, but weak"
   
   c. Check for at least 1 numeric character
      i.   Loop through the string
      ii.  If the character is between 0 and 9, add 1 to the counter
      iii. If the counter is still 0 at the end of the loop, there was no numeric character
           - Show message: "The password must contain at least one digit"
   
   d. Check for at least 1 uppercase alphabetic character
      i.   Loop through the string
      ii.  If the character is between A and Z, add 1 to the counter (ascii values)
      iii. If the counter is still 0 at the end of the loop, there was no uppercase letter
           - Show message: "Password must contain at least one uppercase alphabetic character"
   
   e. Check for at least 1 lowercase alphabetic character
      i.   Loop through the string
      ii.  If the character is between a and z, add 1 to the counter (ascii values)
      iii. If the counter is still 0 at the end of the loop, there was no lowercase letter
           - Show message: "Password must contain at least one lowercase alphabetic character"
   
   f. Check for no more than 2 of the same character in a sequence
      i.   Loop through the string and set the counter to the 1st character of the string
      ii.  If the counter character equals the next character and the one after, there are 3 of the same characters in sequence
           - Show message: "The password cannot contain more than two of the same character in sequence"
      iii. If there are less than 2 characters left to compare, the password is still valid
   
4. Check if passwords match
   a. Loop through all of the characters of string 1 and string 2
   b. If there is a difference in the characters compared, the passwords are different
      i. Show message: "Passwords do not match"
   
5. Password is valid if it passes all of the checks
   a. Show message: "Password is valid"
   
6. End
```

## Security Considerations

This validator implements basic password security rules. For production systems, consider:

- Adding checks for common passwords
- Implementing more sophisticated entropy measurement
- Adding checks for personal information
- Supporting password policies with configurable requirements

## Future Enhancements

Potential improvements for future versions:

- Password strength meter with visual feedback
- Support for special character requirements
- Custom policy configuration
- Password generation suggestions
- Integration with authentication systems
