/**
 * 
 */
package jsp.examples.bt3;

import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee[] employees) {
		System.out.println("How many employee you want to create? : ");
		Scanner scanner = new Scanner(System.in);
		int employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
		for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + (i + 1) + "] : ");
			System.out.println("Name : ");
			String name = scanner.next();
			System.out.println("Please input the information of employee[" + i + 1 + "] : ");
			System.out.println("Name : ");
			Scanner scannerName = new Scanner(System.in);
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
			employees[i] = employee;
		}
		
	}

	@Override
	public void showEmployee(Employee[] employees) {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID Name             Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getId() + " " + employees[i].getName() + "       " + employees[i].getSalary() + " " + employees[i].getJob().getName());
		}
	}

	@Override
	public Employee searchByName(String nameInput, Employee[] employees) {
		Employee employee = null;
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employee = employees[i];
				break;
			}
		}
		return employee;
	}

	@Override
	public void updateEmployeeByName(String nameInput, Double newSalary, Employee[] employees) {
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employees[i].setSalary(newSalary);
				break;
			}
			System.out.println(employees[i].getId() + " " + employees[i].getName() + "       " + employees[i].getSalary() + " " + employees[i].getJob().getName());
		}
	}

}
