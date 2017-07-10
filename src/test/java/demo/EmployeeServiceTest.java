package demo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.model.Employee;
import demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
    EmployeeService employeeService;
	
	@Test
    public void testInsertEmployee() throws Exception {
		System.out.println("Test Insert Employee");
		Employee empl1 = new Employee("15", "test","test","test");
		employeeService.insert(empl1);
	}
	
	@Test
	public void testFindAllEmployees() throws Exception {
		System.out.println("Test Find All Employees");
		List<Employee> employees = employeeService.findAll();
		for (Employee empl: employees)
		{
			System.out.println(empl.getUserId());
		}
	}
}
