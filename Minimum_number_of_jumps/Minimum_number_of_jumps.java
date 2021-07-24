package javademo;

public class Minimum_number_of_jumps {

	public static void main(String[] args) {
		int arr[] = {1,1,1,5,6,9,4,5,6,0};
		int n = arr.length;
		System.out.println("Minimum_number_of_jumps is ");
		System.out.println(minJumps(arr, n));
	}
	static int minJumps(int arr[], int n) {
		int[] jumps = new int[n];
		int min;
		jumps[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] == 0)
				jumps[i] = -1;
			else if (arr[i] >= n - i - 1)
				jumps[i] = 1;
			else {
				min = Integer.MAX_VALUE;
				for (int j = i + 1; j < n && j <= arr[i] + i; j++) {
					if (min > jumps[j])
						min = jumps[j];
				}
				if (min != Integer.MAX_VALUE)
					jumps[i] = min + 1;
				else
					jumps[i] = min;
			}
		}
		return jumps[0];
	}
} // Contributed by Amresh Ranjan.
