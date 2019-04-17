/**
 * 
 */
package jsp.examples.bt3;

/**
 * @author TechCare
 *
 */
public class Employee {
	protected String name;
	protected int id;
	protected double salary;
	protected int age;
	protected boolean married;
	protected Job job;
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
	}
	
	
}
