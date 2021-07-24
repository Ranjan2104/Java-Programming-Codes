package javademo;

public class MiddleElement {

	public static void main(String[] args) {
		int A = 978;
		int B = 518;
		int C = 300;
		if((B > C && B < A) || (B > C && B < A)) System.out.println(B);
        else if((A > B && A < C) || (A > B && A < C)) System.out.println(A);
        else if((C > A && C < B) || (A > B && A < C)) System.out.println(C);
        else System.out.println("Not Match");
	}
} // Contributed by Amresh Ranjan.
