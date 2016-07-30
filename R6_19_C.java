package hw2;

public class R6_19_C {
	public static void main(String[] args) {
		double x = 1;
		double y = 1;
		int i = 0;
		do {
		System.out.println("x:"+x+" y:"+y+" i:"+i);
		y = y / 2;
		x = x + y;
		i++;
		}
		while (x < 1.8);
		System.out.println("x:"+x+" y:"+y+" i:"+i);
		
	}

}
