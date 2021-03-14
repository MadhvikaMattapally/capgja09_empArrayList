package com.capg.empapp.dao;

import java.util.ArrayList;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIDException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public ArrayList<Employee> getAllEmployees() {

		return EmployeeDB.employees;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id,int empNewSalary) throws InvalidEmployeeIDException {
		// TODO Auto-generated method stub
		return EmployeeDB.editSalaryByEmployeeID(id,empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIDException {
		// TODO Auto-generated method stub
		return EmployeeDB.editExpByEmployeeId(id,empNewExp);
	}

	

	public ArrayList<Employee> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}
