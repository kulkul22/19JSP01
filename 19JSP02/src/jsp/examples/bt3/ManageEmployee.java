/**
 * 
 */
package jsp.examples.bt3;

import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class ManageEmployee {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Employee[] employees;
	public static boolean isEndProgram = false;
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				addEmployee();
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.length > 0) {
					showEmployee();
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}
	
	public static void addEmployee() {
		System.out.println("How many employee you want to create? : ");
		employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
		for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + i + 1 + "] : ");
			System.out.println("Name : ");
			Scanner scannerName = new Scanner(System.in);
			String name = scannerName.nextLine();
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
	
	public static void showEmployee() {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID Name             Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getId() + " " + employees[i].getName() + "       " + employees[i].getSalary() + " " + employees[i].getJob().getName());
		}
	}
	
	public static void askForContinue() {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
	
	// TODO : cac ban lam tiep bai tap nay
	// 4. Tim kiem nhan vien theo ten. Vd : searchEmployeeByName("Loc"); -> List danh sach tat ca nhan vien ten Loc
	// 5. Cap nhat lai luong nhan vien theo ten. Vd : updateEmployee("Loc", 2000) -> tat ca employee ten Loc se co salary 2000
}