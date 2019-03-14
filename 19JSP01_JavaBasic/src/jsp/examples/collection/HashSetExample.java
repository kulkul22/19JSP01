/**
 * 
 */
package jsp.examples.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author TechCare
 *
 */
public class HashSetExample {
	public static void main(String[] args) {
		 
        // Tạo một đối tượng Set có sức chứa (capacity) ban đầu 10 phần tử.
        // Nếu số lượng phần tử thêm vào vượt quá sức chứa hiện tại
        // nó sẽ tự tăng sức chứa lên 80%.
        // Đặc điểm của HashSet là phần tử thêm vào sau sẽ đứng ở phía trước.
        Set<String> set = new HashSet<String>(10, (float) 0.8);
 
        set.add("One");
        set.add("Two");
 
        // Khi trùng lặp xẩy ra.
        // Với HashSet: Nó sẽ thêm vào phần tử mới và loại bỏ phần tử cũ.
        set.add("One");
        set.add("Three");
 
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
        	String element = it.next();
            System.out.println(element);
        }
    }
}
