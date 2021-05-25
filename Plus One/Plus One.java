package javademo;

public class PlusOne {

	public static void main(String[] args) {
		int digits[] = {1,3,4};
		PlusOne.nums(digits);
		PlusOne.PrintArray(digits);
	}
	static int[] nums(int digits[]) {
		for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] != 9) { // or take digits[i] < 9
				digits[i]++;
				return digits;
			}
			digits[0] = 0;
		}
		int result[] = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
	static void  PrintArray(int digits[]) {
		System.out.println("Array is ");
		for(int i = 0; i < digits.length; i++) {
			System.out.print(digits[i] + " ");
		}
	}
} // Contributed by Amresh Ranjan.
