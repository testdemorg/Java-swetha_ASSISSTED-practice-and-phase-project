package assisted;


public class constructor {
	

		
		 int EmployeeId;
		 String EmployeeName;
		 String department;
		 float salary;
			
		 public constructor() {
		  EmployeeId=676;
		  EmployeeName="abc";
		  department="teaching ";
		  salary=87500;
		 }
			
		 public constructor(int EmployeeId,String EmployeeName,String department,float salary) {
		  this.EmployeeId=EmployeeId;
		  this.EmployeeName=EmployeeName;
		  this.department=department;
		  this.salary=salary;
		 }
			
		 public void display() {
		  System.out.println("Id of the Employee: "+EmployeeId);
		  System.out.println("Name of the Employee: "+EmployeeName);
		  System.out.println("Department : "+department);
		  System.out.println("Salary : "+salary);
		  System.out.println();
		  
		 }
			
		 public static void main(String[] args) {
		  
		  constructor e= new constructor();
		  constructor e1= new constructor( 676, "abc", "staff", 87500); 

		  e.display();
		  e1.display();
		  
		   
			
		 }
		}


