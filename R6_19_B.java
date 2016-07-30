package hw2;

public class R6_19_B {
	public static void main(String[] args) {
		int i;
		double n = 1 / 2;
		for (i = 2; i <= 5; i++) { 
			System.out.println("i:"+i+" n:"+n);
			n = n + 1.0 / i;		
		}
		System.out.println("i:"+i+" n:"+n);
	}
}
