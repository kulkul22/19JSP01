/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.Scanner;

/**
 * @author ndloc
 *
 */
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Employee nv1 = main.enterEmployeeInfo();
		main.analyzeDepartment(nv1);
		main.showInfo(nv1);

		Employee nv2 = main.enterEmployeeInfo();
		main.analyzeDepartment(nv2);
		main.showInfo(nv2);

		Employee nv3 = main.enterEmployeeInfo();
		main.analyzeDepartment(nv3);
		main.showInfo(nv3);

		Employee nv4 = main.enterEmployeeInfo();
		main.analyzeDepartment(nv4);
		main.showInfo(nv4);

		Employee nv5 = main.enterEmployeeInfo();
		main.analyzeDepartment(nv5);
		main.showInfo(nv5);
	}

	private void showInfo(Employee nv) {
		System.out.println("*************************************");
		System.out.println("Name Employee: " + nv.getName());
		System.out.println("Age:" + nv.getAge());
		System.out.println("Job: " + nv.getJob().getName());
		System.out.println("Department: " + nv.getDepartment());
		System.out.println("*************************************");
	}

	private void analyzeDepartment(Employee em) {
		if (em != null) {
			switch (em.getJob().getName()) {
			case "developer":
				em.setDepartment("development");
				break;
			case "tester":
				em.setDepartment("QA");
				break;
			case "reception":
				em.setDepartment("HR");
				break;
			default:
				em.setDepartment("master");
			}
		}
	}

	private Employee enterEmployeeInfo() {

		Employee nv = new Employee();
		Scanner scan1 = new Scanner(System.in);
		// For name
		System.out.println("Name Employee: ");
		String name = scan1.nextLine();
		nv.setName(name);

		Scanner scan2 = new Scanner(System.in);
		// For age
		System.out.println("Age Employee: ");
		int age = scan2.nextInt();
		nv.setAge(age);

		Scanner scan3 = new Scanner(System.in);
		// For job
		System.out.println("Job Employee: ");
		String developer = scan3.nextLine();
		Job job = new Job();
		job.setName(developer);
		nv.setJob(job);

		Scanner scan4 = new Scanner(System.in);
		// For salary
		System.out.println("Salary Employee: ");
		double sal = scan4.nextDouble();
		nv.setSalary(sal);

		return nv;
	}

}
