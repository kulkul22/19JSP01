/**
 * 
 */
package jsp.examples.exception;

/**
 * @author TechCare
 *
 */
public class HelloCatchException {
	public static void main(String[] args) {
		 
        System.out.println("Three");
 
        // Phép chia này hoàn toàn không có vấn đề.
        int value = 10 / 2;
 
        System.out.println("Two");
 
        // Phép chia này cũng vậy.
        value = 10 / 1;
 
        System.out.println("One");
 
        try {
            // Phép chia này có vấn đề, chia cho 0.
            // Một lỗi đã xẩy ra tại đây.
            value = 10 / 0;
 
            // Dòng code này sẽ không được thực thi.
            System.out.println("Value =" + value);
 
        } catch (ArithmeticException e) {
            // Các dòng code trong catch được thực thi.
            System.out.println("Error: " + e.getMessage());
 
            // Các dòng code trong catch được thực thi.
            System.out.println("Ignore...");
 
        }
 
        // Dòng code này sẽ được thực thi.
        System.out.println("Let's go!");
 
    }
}
