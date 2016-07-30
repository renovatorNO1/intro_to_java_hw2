package hw2;
/**
 * This class model the fuel consumption of a car
 * 
 */
public class Car {
	private double fuelEfficiency;
	private double fuel;
	/**
	 Initialize the car instance and set the parameter value into fuelEfficiency 
	 */
	public Car(int num) {
		fuelEfficiency = num;
	}

	/**add the gas to the fuel tank
	 
	 */
	public void addGas(double num) {
		fuel = fuel + num;
	}
	/**
	 * Substract the consumption of fuel according to distance the car drives
	 */
	public void drive(double mileage) {
		fuel = fuel - mileage * fuelEfficiency;
	}
	/** 
	 * Get the current value of gas in tank
	 * @return the current gas value
	 */
	public double getGasInTank() {
		return fuel;
	}
	

}
