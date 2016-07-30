package hw2;
import java.util.Scanner;
/**
 * Print all the powers of 2 that are less than n
 * @author Yuxuan
 *
 */
public class powerOf2 {
	public static void main(String[] args) {
		//Initialize a Scanner variable that collects input from users
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your input?");
		int n = reader.nextInt();//Store the user input into n
		int i = 0;//Initialize the counter
		int power = (int) Math.pow(2, i);
		while (power < n)//Check if the power if less than n
		{
			System.out.println(power);
			i++;//Update the counter
			power = (int) Math.pow(2, i);//Update the power
		}
		reader.close();
	}
}
