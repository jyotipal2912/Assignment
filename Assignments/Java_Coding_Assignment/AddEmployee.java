package q3and4;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> employeeList = new ArrayList();

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public Employee getEmployee(int id) {
		for (Employee emp : employeeList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		AddEmployee addEmployee = new AddEmployee();

		addEmployee.addEmployee(new Employee(63, "Kumar", "Bangalore"));
		addEmployee.addEmployee(new Employee(29, "Anitha", "Chennai"));

		int searchId = 29;
		Employee foundEmployee = addEmployee.getEmployee(searchId);
		if (foundEmployee != null) {
			System.out.println("Employee found: " + foundEmployee);
		} else {
			System.out.println("Employee with ID " + searchId + " not found.");
		}

	}

}
