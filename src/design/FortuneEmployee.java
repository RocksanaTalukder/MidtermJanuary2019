package design;
import databases.ConnectToSqlDB;
import java.util.*;
import databases.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;

public class FortuneEmployee extends EmployeeInfo {


	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {

		companyName = "ABC Company";
		EmployeeInfo empInfo = new EmployeeInfo(1245);
		int pension = empInfo.calculateEmployeePension();
		System.out.println(companyName);
		System.out.println("Employee Information");
		System.out.println("EmployeeID" + '\t' + "EmployeeNName" + '\t'+ empInfo.calculateSalary() +
				empInfo.assignDepartment() 	+ pension);
		System.out.println(empInfo.employeeId() +  '\t' + empInfo.employeeName() +'\t'+ empInfo.calculateSalary() +'\t'+
				empInfo.assignDepartment() 	+ '\t'+ pension);



	}




}
