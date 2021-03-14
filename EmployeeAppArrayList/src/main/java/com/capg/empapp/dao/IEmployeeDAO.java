package com.capg.empapp.dao;

import java.util.ArrayList;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIDException;
import com.capg.empapp.exceptions.WrongSalaryException;

public interface IEmployeeDAO {
	
	 public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id,int empNewSalary)throws InvalidEmployeeIDException;
	 
	 public boolean editExpByEmployeeId(int id,int empNewExp)throws InvalidEmployeeIDException;
	 
	 public ArrayList<Employee> getAllEmployees();
	 
	 public ArrayList<Employee> getEmployeeBySalary(int salary);
	 
	 public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
