package com.hcl.department;

import java.util.Scanner;



public class AddDepartmentMain {
	public static void main(String[] args) {
		DepartmentDao dao=new DepartmentDao();
		System.out.println(dao.generateDeptno());
		Department dept=new Department();
		int deptno=dao.generateDeptno();
		dept.setDeptno(deptno);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter department Name ");
		dept.setDname(sc.nextLine());
		System.out.println("enter Department City ");
		dept.setCity(sc.nextLine());
		System.out.println("enter Department loc");
		dept.setLoc(sc.nextLine());
		System.out.println("enter department head ");
		dept.setHead(sc.nextLine());
		System.out.println(dao.addDepartment(dept));
	}

}
