package javademo;

import java.util.HashSet;

public class InterSectionArray2 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,4,2,3,5,4,4,4,4,10};
		int arr2[] = {1,2,3,2,1,3,5,6,6,10};
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for(int val : arr1) hs1.add(val);
		for(int val : arr2) hs2.add(val);
		for(int val : hs2) {
			boolean b = hs1.add(val);
			if(b == false) System.out.print(val + " ");
		}	
	}
} // Contributed by Amresh Ranjan.
