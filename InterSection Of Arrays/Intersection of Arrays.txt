package javademo;

import java.util.HashSet;

public class InterSectionArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,2};
		int arr2[] = {1,2,3};
		Intersection(arr1, arr2);
	}
	static void Intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					hs.add(arr1[i]);
					break;
			   }
			}
		}
		for(int val : hs) System.out.print(val + " ");
	}
} // Contributed by Amresh Ranjan.
