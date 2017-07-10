package demo.model;
import java.util.List;

public interface EmployeeDAO {
	public void insert(Employee employee);
	public List<Employee> findAll();
}
