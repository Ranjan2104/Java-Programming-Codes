package proj1;
import java.util.Scanner;
public class Code {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for (int i = 10; i >= 1; i--) {
			    if (n%i==0) { 
			        System.out.println(i);
			        break;
			    }
			}
		}
	}
} // Contributed by Amresh Ranjan.
