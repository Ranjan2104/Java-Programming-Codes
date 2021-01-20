package Java;

public class Anagram {

	public static void main(String[] args) {
		String a = "%*^";
		String b = "*^$";
		boolean isAnagram = true;
		int as[] = new int[256];
		int bs[] = new int[256];
		for(char c : a.toCharArray())
		{
			int index = (int) c;
			as[index]++;
		}
		for(char c : b.toCharArray())
		{
			int index = (int) c;
			bs[index]++;
		}
		for(int i = 0; i < 256; i++)
		{
			if(as[i] != bs[i])
			{
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) System.out.println("yes it is Anagram");
		else System.out.println("no it is not Anagram");
	}

}
// Contribute by Amresh Ranjan.