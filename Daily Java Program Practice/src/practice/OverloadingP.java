package practice;

public class OverloadingP {

	public void Car() 
	{
		System.out.println("Car Details");
	}
	
	public String Car (String carModel) 
	{
		return carModel.toLowerCase() ;
	}
	
	public void Car (String Colour , int Seater)
	{
		System.out.println("Car Colour & Seater : " + Colour +" & "+ Seater );
	}
	
	public String Car (String Company , String Country) 
	{
		return Company + " ," +  Country ;
	}
	
	public static void main(String[] args) 
	{
		OverloadingP  N = new OverloadingP();
		N.Car();
		String CC = N.Car("TATA MOTORS", "INDIA");
		System.out.println("Company and Country : " + CC);
		String caarmodel  = N.Car("TATA CURVE");
		System.out.println("Car Model : " + caarmodel);
		N.Car("Black", 5);
	}

}
