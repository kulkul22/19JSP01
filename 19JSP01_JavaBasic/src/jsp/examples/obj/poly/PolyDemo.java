/**
 * 
 */
package jsp.examples.obj.poly;

/**
 * @author ndloc
 *
 */
public class PolyDemo {
	public interface Vegetarian{};
	public class Animals {};
	public class Deer extends Animals implements Vegetarian {
		Deer d = new Deer();
		Animals a = d;
		Vegetarian v = d;
		Object o = d;
	};
	
}
