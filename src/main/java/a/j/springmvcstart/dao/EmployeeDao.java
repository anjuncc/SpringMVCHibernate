package a.j.springmvcstart.dao;

import java.util.List;

import a.j.springmvcstart.model.Employee;

public interface EmployeeDao {
	 
    Employee findById(int id);
 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
 
}