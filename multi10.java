package hw2;
import java.util.Scanner;
/**
 * Print all multiples of 10 that are less than n
 * @author Yuxuan
 *
 */
public class multi10 {
	public static void main(String[] args) {
		//Declare a scanner variable called reader that collects input from users
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your input?");
		
		int n = reader.nextInt();//Store the user input into n
		int i = 1;//Initialize i
		int mul10 = 10 * i;//Initialize the first multiple of 10
		
		while (mul10 < n)//Check if the multiple of 10 is less than n
		{
			System.out.println(mul10);
			i++;
			mul10 = 10 * i;//Update the mul10
		
		}
		reader.close();//Close the Scanner
		
	}

}
