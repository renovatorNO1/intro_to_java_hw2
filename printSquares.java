package hw2;
import java.util.Scanner;
/**
 * Print all the squares that are lower than n, which is furnished by users
 * @author Yuxuan
 *
 */
public class printSquares {
	public static void main(String[] args) {
		//initialize a scanner variable so that it takes input from users
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your input?");
		int n = reader.nextInt();//Store the user input into n
		int i = 1;
		
		while (Math.pow(i, 2) < n) //Check if the square is less than n
		{
			double square = Math.pow(i, 2);
			int k = (int) square;
			System.out.println(k);
			i++;//update i
		
		}
		reader.close();//Close the scanner
	}

}
