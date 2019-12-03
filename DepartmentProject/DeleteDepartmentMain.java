package com.hcl.department;

import java.util.Scanner;



public class DeleteDepartmentMain {
	public static void main(String[] args) {
		int deptno;
		System.out.println("enter Department no");
		Scanner sc=new Scanner(System.in);
		deptno=sc.nextInt();
		DepartmentDao dao=new DepartmentDao();
		System.out.println(dao.deleteDepartment(deptno));
	}
	}


