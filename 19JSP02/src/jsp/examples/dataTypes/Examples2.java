/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class Examples2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullName =  input1.nextLine();
		System.out.println("Your fullName is : " + fullName);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullName2 =  input2.next();
		System.out.println("Your fullName is : " + fullName2);
	}

}
