/**
 * 
 */
package jsp.examples.bt2;

/**
 * @author TechCare
 *
 */
public class Dog {
	protected String color;
	protected String name;
	protected String breed;
	
	public Dog(String color, String name, String breed) {
		this.color = color;
		this.name = name;
		this.breed = breed;
	}

	protected void wagging(String waggingAction) {
		System.out.println("wagging detail : " + waggingAction);
	}
	
	protected void barking(String barkingAction) {
		System.out.println("barking detail : " + barkingAction);
	}
	
	protected void eating(String eatingAction) {
		System.out.println("eating detail : " + eatingAction);
	}
}
