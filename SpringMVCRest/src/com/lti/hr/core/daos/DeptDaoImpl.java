package com.lti.hr.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exceptions.HrException;

//superinterface
/*
 * RequiresNew : always create new transaction
 * Required: Use transaction which is already created
 * if not created , create new
 */
@Repository

public class DeptDaoImpl implements DeptDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		String strQry = "from Department";
		Query qry = manager.createQuery(strQry);
		List<Department> lst=qry.getResultList();
		
		return (ArrayList<Department>) lst;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean insertNewDept(Department dept) throws HrException {
		manager.persist(dept);
		
		return true;
	}
	@Override
	public Department getDeptid(int deptId) throws HrException {
		String strQry2 ="from Department where deptNo="+deptId;
		Query qry = manager.createQuery(strQry2);
		Department lst=(Department) qry.getSingleResult();
		return lst;
	}

}
