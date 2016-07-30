package hw2;

public class loopB {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int n = 0;
		while (i<10) {
			System.out.println("i:"+i+" j:"+j+" n:"+n);
			i++;
			n = n+i+j;
			j++;
		}
	}

}
