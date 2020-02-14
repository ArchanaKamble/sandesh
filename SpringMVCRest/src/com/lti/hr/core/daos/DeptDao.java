package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exceptions.HrException;

//interface created samjun ghe
public interface DeptDao {
	public ArrayList<Department> getDeptList() throws HrException;
	public boolean insertNewDept(Department d) throws HrException;
	public Department getDeptid(int deptId) throws HrException;
}
