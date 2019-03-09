/**
 * 
 */
package jsp.examples.obj.opp;

/**
 * @author ndloc
 *
 */
public class TestDog {
	public static void main(String args[]) {
		Dog d = new Dog("Kiki", 3, "dog");
		System.out.println("Name of " + d.getTypeAnimal() + " is : " + d.getName());
		System.out.println("Age of " + d.getTypeAnimal() + " is : " + d.getAge());
		d.dogMove();
		Animals animal = new Dog("Lulu", 3, "dog");
		//Animals animal = new Animals("Beck", 4);
		System.out.println(animal.getName());
	}
}
