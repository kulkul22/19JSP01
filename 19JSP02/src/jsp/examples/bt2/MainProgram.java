/**
 * 
 */
package jsp.examples.bt2;

/**
 * @author TechCare
 *
 */
public class MainProgram {
	public static void main(String args[]) {
		Dog dog1 = new Dog("yello", "Beck", "male");
		System.out.println("Dog 1 : " + dog1.name + " " + dog1.color + " " + dog1.breed);
		dog1.wagging("Vay duoi nhiet tinh");
		dog1.barking("Sua rat to");
		dog1.eating("An nhieu");
	}
}
