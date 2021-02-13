class Test 
{ 
	// method to print the divisors 
	static void printDivisors(int n) 
	{ 
		// Note that this loop runs till square root 
		for (int i=1; i<=Math.sqrt(n); i++) 
		{ 
			if (n%i==0) 
			{ 
				if (n/i == i) 
					System.out.print(" "+ i); 
	
				else
					System.out.print(i+" " + n/i + " " ); 
			} 
		} 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		System.out.println("The divisors of 100 are: "); 
		printDivisors(100);; 
	} 
} // Contributed by Amresh Ranjan.