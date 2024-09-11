package practice;

public class OverloadingP {

	public void Car() 
	{
		System.out.println("Car Details");
	}
	
	public void Car (String carModel) 
	{
		System.out.println("Car Model : " + carModel);
	}
	
	public void Car (String Colour , int Seater)
	{
		System.out.println("Car Colour & Seater : " + Colour +" & "+ Seater );
	}
	
	public void Car (String Company , String Country) 
	{
		System.out.println("Company & Country Belongs To : " + Company + " ," + Country);
	}
	
	public static void main(String[] args) 
	{
		OverloadingP  N = new OverloadingP();
		N.Car();
		N.Car("TATA MOTORS", "INDIA");
		N.Car("TATA CURVE");
		N.Car("Black", 5);
		

	}

}
