/**
 * 
 */
package jsp.examples.exception;

/**
 * @author TechCare
 *
 */
public class AgeUtils {
	
	public static void main(String args[]) throws TooYoungException, TooOldException {
		checkAge(15);
	}
	 
    // Phương thức này làm nhiệm vụ kiểm tra tuổi.
    // Nếu tuổi nhỏ hơn 18 nó sẽ ném ra ngoại lệ TooYoungException
    // Nếu tuổi lớn hơn 40 nó sẽ ném ra ngoại lệ TooOldException
    public static void checkAge(int age) throws TooYoungException, TooOldException {
        if (age < 18) {
            // Nếu tuổi nhỏ hơn 18, một ngoại lệ sẽ được ném ra
            // Phương thức này sẽ kết thúc tại đây.
            throw new TooYoungException("Age " + age + " too young");
        } else if (age > 40) {
            // Nếu tuổi lớn hơn 40, ngoại lệ sẽ được ném ra.
            // Method này kết thúc tại đây.
            throw new TooOldException("Age " + age + " too old");
        }
        // Nếu tuổi nằm trong khoảng 18-40.
        // Đoạn code này sẽ được chạy.
        System.out.println("Age " + age + " OK!");
    }
    
}
