/**
 * 
 */
package jsp.examples.obj.abs;

/**
 * @author ndloc
 *
 */
public class TestAbstraction1 {

	// Trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung
	public static void main(String args[]) {
		// Trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc,
		// chang han nhu getShape()
		Shape s1 = new Circle();
		s1.draw();
		Shape s2 = new Rectangle();
		s2.draw();
	}

}
