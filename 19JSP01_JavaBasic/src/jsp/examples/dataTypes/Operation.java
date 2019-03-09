/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.ArrayList;

/**
 * @author TechCare
 *
 */
public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C = 10;
		int A = 10;
		C = C +  A; // C += A
		System.out.print(C);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		ArrayList<Employee> employs = new ArrayList<Employee>();
		employs.add(e1);
		employs.add(e2);
		employs.add(e3);
		employs.add(e4);
		employs.add(e5);
		for (int i=0; i< employs.size();i++) {
			//employs.get(i).getJob().getName();
			if (employs.get(i).getJob().getName().equals("Developer")) {//employ have a job is "Developer"
				// TODO
			}
		}
		if (C>A || C==A) {// C >= A
			System.out.print(A);
		} else {
			System.out.print(C);
		}
	}

}
