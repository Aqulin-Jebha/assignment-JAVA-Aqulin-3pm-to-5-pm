public class CompanySystem {
	int EmployeeId;
	String EmployeeName;//instance variable
	
	CompanySystem()
	{
	    EmployeeId = 100;
	    EmployeeName = "Not Assigned";
	
	}
   public void display()
   {

	        System.out.println("Emplyee id =" + EmployeeId);
	        System.out.println("Emplyee name =" + EmployeeName);
	   }
	  

	public static void main(String[] args) {
		CompanySystem cs = new CompanySystem();
		cs.display();
	}}