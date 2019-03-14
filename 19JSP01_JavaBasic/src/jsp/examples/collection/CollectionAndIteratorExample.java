/**
 * 
 */
package jsp.examples.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author TechCare
 *
 */
public class CollectionAndIteratorExample {
	public static void main(String[] args) {
		 
        // Tạo một đối tượng List (Chỉ chứa các String).
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
 
        // Lấy ra đối tượng ListIterator để duyệt các phần tử của danh sách.
        // (Theo đúng trình tự).
        // Returns a list iterator over the elements in this list
        // (in proper sequence)
        ListIterator<String> listIterator = list.listIterator();
 
        // Hiện tại con trỏ đang đứng tại ví trí đầu tiên của Iterator.
        // Đứng tại vị trí có chỉ số 0.
        // Lấy ra phần tử đầu tiên trong Iterator, con trỏ tiến thêm một bước.
        String first = listIterator.next();
        System.out.println("first:" + first);// -->"One"
 
        // Hiện tại con trỏ đang đứng tại vị trí có chỉ số 1.
        // Lấy ra phần tử tiếp theo.
        String second = listIterator.next();
        System.out.println("second:" + second);// -->"Two"
 
        // Kiểm tra xem con trỏ có thể nhẩy lùi trở lại 1 vị trí hay không.
        if (listIterator.hasPrevious()) {
            // Nhẩy trở lại 1 bước.
            String value = listIterator.previous();
            System.out.println("value:" + value);// -->"Two"
        }
 
        System.out.println(" ----- ");
 
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println("value:" + value);
        }
    }
}
