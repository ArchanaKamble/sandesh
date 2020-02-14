package com.lti.hr.core.services;

import java.util.ArrayList;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exceptions.HrException;

public interface DeptService {

	public ArrayList<Department> getDeptList() throws HrException;
	public boolean createNewDepartment(Department dept) throws HrException;
	public Department getDeptid(int deptId) throws HrException;
}
