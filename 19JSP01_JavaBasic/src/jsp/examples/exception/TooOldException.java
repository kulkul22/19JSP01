/**
 * 
 */
package jsp.examples.exception;

/**
 * @author TechCare
 *
 */
public class TooOldException extends AgeException {

	private static final long serialVersionUID = 1L;

	public TooOldException(String message) {
		super(message);
	}

}
