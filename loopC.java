package hw2;

public class loopC {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int n = 0;
		while (i>0) {
			System.out.println("i:"+i+" j:"+j+" n:"+n);
			i--;
			j++;
			n=n+i-j;
		}
	}

}
