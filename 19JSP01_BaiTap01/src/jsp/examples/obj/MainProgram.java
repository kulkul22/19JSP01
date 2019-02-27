/**
 * 
 */
package jsp.examples.obj;

/**
 * @author ndloc
 *
 */
public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Dave", 6, "boy");
		Student student2 = new Student("Join", 7, "boy");
		Student student3 = new Student("Juli", 6, "girl");
		
		System.out.println("---------------This is information of student 1 : -------------------");
		System.out.println("Name : " + student1.getName());
		System.out.println("Age : " + student1.getAge());
		System.out.println("Name : " + student1.getGender());
		System.out.println("---------------This is information of student 1 updated : -------------------");
		student1.setAge(8);
		System.out.println("Age : " + student1.getAge());
		System.out.println("---------------This is information of student 2 : -------------------");
		System.out.println("Name : " + student2.getName());
		System.out.println("Age : " + student2.getAge());
		System.out.println("Name : " + student2.getGender());
		System.out.println("---------------This is information of student 3 : -------------------");
		System.out.println("Name : " + student3.getName());
		System.out.println("Age : " + student3.getAge());
		System.out.println("Name : " + student3.getGender());
	}

}
