/**
 * 
 */
package jsp.examples.obj.poly;

/**
 * @author ndloc
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape = new Shape();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Shape"
         
        // bản chất của shape là Shape, nhưng vì khai báo Rectangle nên chúng ta chỉ nhìn thấy những gì mà Rectangle có
        // vì vậy sẽ chạy những hàm của Rectangle
        shape = new Rectangle();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Rectangle"
         
        // tương tự lúc này shape sẽ đóng vai trò là 1 Square
        shape = new Square();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Square"
		
	}

}
