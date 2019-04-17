/**
 * 
 */
package jsp.examples.bt3;

/**
 * @author TechCare
 *
 */
public class MainProgram {
	public static void main(String args[]) {
		
		
		
		//Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "BA");
		Job job3 = new Job(3, "Tester");
		Job job4 = new Job(4, "Developer");
		Job job5 = new Job(5, "CEO");
		Employee employee1 = new Employee("Nguyen Van A", 1, 3000, 25, false, new Job(1, "HR"));//1
		Employee employee2 = new Employee("Nguyen Van B", 2, 4000, 25, false, job2);
		Employee employee3 = new Employee("Nguyen Van C", 3, 5000, 25, true, job3);
		Employee employee4 = new Employee("Nguyen Van D", 4, 6000, 25, false, job4);
		Employee employee5 = new Employee("Nguyen Van E", 5, 7000, 25, false, job5);
		Employee[] employees = new Employee[5];
		employees[0] = employee1;//2
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		employees[0].id = 7;//3
		System.out.println("Mang co : " + employees.length + " phan tu");
		System.out.println("----------------Thong tin employee-----------");
		System.out.println("ID Name             Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].id + " " + employees[i].name + "       " + employees[i].salary + " " + employees[i].job.name);
		}
		
	}
}
