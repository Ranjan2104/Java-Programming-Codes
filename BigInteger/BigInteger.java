package Java;
import java.math.BigInteger;
class GFG { 
	public BigInteger fact(int n)
	{
		BigInteger f = new BigInteger("1");
		for(int i = 2; i <= n; i++)
		{
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
} 
		
public class programmingJava {

	public static void main(String[] args) {
		GFG h = new GFG();
		System.out.println(h.fact(5));
	}
} // Contributed by Amresh Ranjan.





