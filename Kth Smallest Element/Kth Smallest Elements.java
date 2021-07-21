package javademo;
import java.util.Arrays;

public class KthSmallest {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 4;
		int l = Smallest(arr, k);
		System.out.println(l);
	}
	static int Smallest(int arr[], int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
} // Contributed by Amresh Ranjan.
