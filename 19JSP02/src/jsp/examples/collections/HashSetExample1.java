/**
 * 
 */
package jsp.examples.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ndloc
 *
 */
public class HashSetExample1 {
	public static void main(String[] args) {
        // Creating hashset
        Set<String> set = new HashSet<String>();
        // Add objects to hashset
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");
        // Show set through Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show set through for-each
        System.out.println();
        for (String obj : set) {
            System.out.print(obj + ", ");
        }
    }
}
