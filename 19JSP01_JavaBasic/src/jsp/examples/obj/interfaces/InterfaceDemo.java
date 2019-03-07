/**
 * 
 */
package jsp.examples.obj.interfaces;

/**
 * @author ndloc
 *
 */
interface printable {
	void print();
}

public class InterfaceDemo implements printable {

	@Override
	public void print() {
		System.out.println("Hello");

	}

	public static void main(String args[]) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.print();
	}

}
