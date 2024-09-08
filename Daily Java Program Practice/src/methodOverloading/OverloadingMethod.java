package methodOverloading;

public class OverloadingMethod {

	public void display() {
		System.out.println("Employee Details");
	} 	
	
	public void display(int ID) {
        System.out.println("Emp ID : " + ID);		
	}
	
	public void display(String EmpFname , String EmpLname) {
		System.out.println("Full Name : " + EmpFname + " " + EmpLname);
	}
	
	public void display(String EmpAddress) {
		System.out.println("Address : " + EmpAddress);
	}
	
	public void display(Long mobileNumber) {
		System.out.println("Emp Mo. No : " + mobileNumber);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingMethod D = new OverloadingMethod();
		D.display();
		D.display(1208);
		D.display("Yuvraj", "Chavale");
		D.display(9834464435L);
		D.display("Gurudwara Saheb Ameerpet Hyderabad Telangana");
		
	}

}
