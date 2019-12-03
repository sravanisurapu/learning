package com.hcl.department;

import java.util.Scanner;


public class SearchDeparmentMain {
	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department no ");
		deptno=sc.nextInt();
		DepartmentDao dao=new DepartmentDao();
		Department dept=dao.searchDepartment(deptno);
		if(dept!=null) {
			System.out.println("DName " +dept.getDname());
			System.out.println("Department " +dept.getCity());
		} else {
			System.out.println("Record not Found..");
	}

	}
}
