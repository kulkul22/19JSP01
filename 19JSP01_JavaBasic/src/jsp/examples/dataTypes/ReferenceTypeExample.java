/**
 * 
 */
package jsp.examples.dataTypes;

/**
 * @author ndloc
 *
 */
public class ReferenceTypeExample {
	int value = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// vd 1
		ReferenceTypeExample x = new ReferenceTypeExample();
		ReferenceTypeExample y = x;
		 
		System.out.println("Before assign");
		System.out.println("x = "+x.value);
		System.out.println("y = "+y.value);
		 
		y.value = 8;
		System.out.println("After assign");
		System.out.println("x = "+x.value);
		System.out.println("y = "+y.value);
		
		
	}

}
