package Java;
class gcd
{
	public int GCD(int a, int b)
	{
		if(a == 0)
			return b;
		return GCD(b % a,a);
	}
}
public class prog {

	public static void main(String[] args) {
		gcd g = new gcd();
		System.out.println(g.GCD(10, 15));
		System.out.println(g.GCD(35, 10));
		System.out.println(g.GCD(31, 2));
	}
} // Contributed by Amresh Ranjan.
