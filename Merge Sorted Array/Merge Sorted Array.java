package javademo;
import java.util.HashSet;
public class MergeSortedArray {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[] = {30,40,50,60,70,80,70};
		MergeArray(a, b);
	}
	static void MergeArray(int a[], int b[]) {
		int a_len = a.length;
		int b_len = b.length;
		int c_len = a_len + b_len;
		int[] c = new int[c_len];
		for(int i = 0; i < a.length; i++) c[i] = a[i];
		for(int i = 0; i < b.length; i++) c[a.length + i] = b[i]; 
		HashSet<Integer> hs = new HashSet<>();
		for(int h : c)
			hs.add(h);
		System.out.print(hs + " ");	
	} 
} // Contributed by Amresh Ranjan.
