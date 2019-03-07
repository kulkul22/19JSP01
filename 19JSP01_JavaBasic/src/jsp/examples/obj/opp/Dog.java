/**
 * 
 */
package jsp.examples.obj.opp;

/**
 * @author ndloc
 *
 */
public class Dog extends Animals {
	@Override
	public void move() {
		super.move();
		System.out.println("Dog can walk and run");
	}
}
