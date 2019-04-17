/**
 * 
 */
package jsp.examples.loop;

/**
 * @author TechCare
 *
 */
public class DoWhileExamples {
	public static void main(String args[]) {
		int a = 1, sum = 0;
        do {
            sum += a; // sum = sum + a
            a++;
        } while (a <= 10);
        System.out.println("Sum of 1 to 10 is : " + sum);

	}
}
