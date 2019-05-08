package jsp.examples.bt3;

public interface EmployeeDAO {
	public void addEmployee(Employee[] employees);
	public void showEmployee(Employee[] employees);
	public Employee searchByName(String nameInput, Employee[] employees);
	public void updateEmployeeByName(String nameInput, Double newSalary, Employee[] employees);
}
