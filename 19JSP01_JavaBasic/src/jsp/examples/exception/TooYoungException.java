/**
 * 
 */
package jsp.examples.exception;

/**
 * @author TechCare
 *
 */
public class TooYoungException extends AgeException {
	 
	private static final long serialVersionUID = 1L;

	public TooYoungException(String message) {
	     super(message);
	 }
}
