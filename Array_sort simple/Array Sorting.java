package javademo;
import java.util.Arrays;	

public class Example {

	public static void main(String[] args) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		Sort(arr);
	}
	static void Sort(int arr[]) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
	}
} // Contributed by Amresh Ranjan.
