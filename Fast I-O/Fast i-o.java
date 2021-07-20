import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastInputOutput {

	public static void main(String[] args) throws IOException {
		try (
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		System.out.println("Enter a String: ");
		String str = br.readLine();
		System.out.println("String is " + str);
		}
	}
}
// Contributed by Amresh Ranjan.