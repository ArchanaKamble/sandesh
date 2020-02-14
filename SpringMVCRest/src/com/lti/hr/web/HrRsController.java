package com.lti.hr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exceptions.HrException;
import com.lti.hr.core.services.DeptService;

@RestController
public class HrRsController {
	
	@Autowired
	private DeptService service;
	
	//@RequestMapping(name="/deptList",produces="application/json", method=RequestMethod.GET)	
	@GetMapping(value="deptList", produces="application/json")
	public @ResponseBody List<Department> getDeptList(){
		
		ArrayList<Department> deptList = null;
		try {
			deptList = service.getDeptList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptList;
	}
	
	
	@PostMapping(value="/addDept", consumes="application/json")
	public void getDeptList(@RequestBody Department dept) {
		System.out.println(dept);
		try {
			service.createNewDepartment(dept);
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
	@GetMapping(value="/getDept",produces="application/json")
	public @ResponseBody Department getDeptById(@RequestParam int deptId) {
		Department dept=null;
		try {
			dept = service.getDeptid(deptId);
		} catch (HrException e) {
			e.printStackTrace();
		}
		return dept;
		
	}
}
