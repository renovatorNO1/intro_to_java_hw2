package hw2;

public class CarTester {
	/**
	 * Test the methods of Car class
	 * @param args not used
	 */
	public static void main(String[] args) {
		Car my_BMW;
		my_BMW = new Car(20);
		System.out.println(my_BMW.getGasInTank());
		my_BMW.addGas(50);
		double gassLeft = my_BMW.getGasInTank();
		System.out.println("50 gallons are added");
		System.out.println("Now the fuel in my BMW is "+
							gassLeft + " gallons");
		my_BMW.drive(2);
		gassLeft = my_BMW.getGasInTank();
		System.out.println("I drived my car for 2 miles");
		System.out.println("Now the fuel in my BMW is "+
				gassLeft+ " gallons");
		
	}

}
