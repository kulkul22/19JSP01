/**
 * 
 */
package jsp.examples.obj.opp;

/**
 * @author ndloc
 *
 */
public class Dog extends Animals {
	private String typeAnimal;
	
	public Dog(String name, int age, String typeAnimal) {
		super(name, age);
		this.typeAnimal = typeAnimal;
	}
	
	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public void dogMove() {
		super.move();
		System.out.println("Dog can walk and run");
	}
}
