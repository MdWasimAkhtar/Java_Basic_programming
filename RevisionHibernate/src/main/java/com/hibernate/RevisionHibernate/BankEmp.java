package com.hibernate.RevisionHibernate;
import javax.persistence.*;

@Entity
public class BankEmp {
	
	@Id
	private int empId;
	private String empName;
	private long salary;
	private String dept;
	
	public BankEmp() {
		super();
	}
	
	

	public BankEmp(int empId, String empName, long salary, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "BankEmp [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}

	
	
	
}
