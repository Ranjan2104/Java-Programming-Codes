package javademo;

public class MaxofThree {
	public void max(int a, int b, int c)
	{
		int y = Math.max(a, Math.max(b, c));
		System.out.println("Max is " + y);
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 10;
		MaxofThree x = new MaxofThree();
		x.max(a, b, c);	
	}
} // Contributed by Amresh Ranjan.
