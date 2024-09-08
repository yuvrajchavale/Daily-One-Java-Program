package methodOverloading;

public class OverloadingExperiencePerson {

	public void display() {
		System.out.println("Displaying Employee Details ");
	}
	
	public void display(int empID) {
		if(empID <= 0) {
			System.out.println("Invalid Employe ID");
		}
		else {
			System.out.println("Emp ID : " + empID);
		}
	}
	
	public void display (String empFirstName , String empLastName) {
		if (empFirstName == null || empLastName == null ||empFirstName.isEmpty() || empLastName.isEmpty()) {
		System.out.println("Invalid Employee Name");	
		}
		else {
			System.out.println("Full Name : " + empFirstName + " " + empLastName);
		}
	}
	
	public void display(String empAddress) {
		if(empAddress == null || empAddress.isEmpty()) {
			System.out.println("Invalid Employee Address");
		}else {
			System.out.println("Address: " + empAddress);
		}
	}
	
	public void display(Long mobileNumber) {
		if(mobileNumber == null || mobileNumber.toString().length() !=10) {
			System.out.println("Invalid Mobile Number");
		} else {
			System.out.println("Employee Mobile No.: " + mobileNumber);
		}
	}
	
	public static void main(String[] args) {
		
		OverloadingMethod EmployeeDetails = new OverloadingMethod();
		EmployeeDetails.display();
		EmployeeDetails.display(-1);
		EmployeeDetails.display("Yuvraj", "Chavale");
		EmployeeDetails.display(-1542464L);
		EmployeeDetails.display("Gurudwara Saheb Ameerpet Hyderbad Telangana");

	}

}
