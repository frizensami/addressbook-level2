package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    public final String value;
    private boolean isPrivate;
    
    public static String EXAMPLE = "";
    public static String MESSAGE_CONTACT_CONSTRAINTS = "Contact can be in any format";
    public static String CONTACT_VALIDATION_REGEX = ".+";
    
    /*
     * Checks if a given contact, with a specified privacy, is valid before saving it internally.
     */
    public Contact(String value, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        value = value.trim();
        if (!isValidContact(value, CONTACT_VALIDATION_REGEX)) {
            throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
        }
        this.value = value;
    }
    
    /*
     * Checks if a given contact, with a specified privacy, is valid before saving it internally. Custom validation
     * regex can be used. This constructor is for use by the subclasses of Contact only. 
     */
    protected Contact(String value, boolean isPrivate, String validationRegex, String constraintMessage) throws IllegalValueException {
        this.isPrivate = isPrivate;
        value = value.trim();
        if (!isValidContact(value, validationRegex)) {
            throw new IllegalValueException(constraintMessage);
        }
        this.value = value;
    }

    /*
     * Checks if a given contact string matches a given regex pattern string.
     */
    private boolean isValidContact(String test, String regexToMatch) {
        return test.matches(regexToMatch);
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    

    public boolean isPrivate() {
        return isPrivate;
    }

}
