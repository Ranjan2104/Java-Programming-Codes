package javademo;
public class CyclicallyRotationArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(Original Array is );
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] +  );
		Cyclically(arr);
	}
	static void Cyclically(int arr[]) {
		int n = 1;
		int end;
		for(int i = 0; i  n; i++) {
			end = arr[arr.length - 1];
			for(int j = arr.length - 1; j  0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = end;
		}
		System.out.println( );
		System.out.println(After Cylically rotate by 1 is );
		for(int i = 0; i  arr.length; i++) 
			System.out.print(arr[i] +  );
	}
} // Contributed by Amresh Ranjan.
