package com.te.springboot.service;

import java.util.List;

import com.te.springboot.entity.Employee;

public interface EmployeeService {

	public Employee getEmployee(String empId);

	public Employee register(Employee employee);

	public List<Employee> search();

	public void delete(Employee employee);

}
