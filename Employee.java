public class Employee{
  public static void main(String args[]){
	  
	  
	  Details d = new Details();
	  d.get();
	  

    
  
  }
}

class Details{
	
	int emp_id = 1;
	  String emp_name = "Raj";
	  String emp_designation = "HR";
	  int salary = 45000 ;
	
	void get(){
		  
		  System.out.println("Employee id = "+emp_id);
		  System.out.println("Employee Name = "+emp_name);
		  System.out.println("Employee Designation = "+emp_designation);
		  System.out.println("Employee Salary = "+salary);
		  
	  }
}


     
	  
	  
	  
	  
