package com.mindtree.dao;

import java.sql.SQLException;
import java.util.List;

import com.mindtree.entity.Employee;

public interface Employeedao 
{
	public  List<Employee> getEmployee() throws SQLException;
}
