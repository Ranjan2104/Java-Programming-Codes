package amreshJava;
class inssort
{
	public void insorting(int arr[])
	{
		int temp, j;
		for(int i = 0; i < arr.length; i++)
		{
			temp = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > temp)
			{
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
		for(int i = 0; i <arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
public class insertionsot {

	public static void main(String[] args) {
		inssort s = new inssort();
		int arr[] = {5,1,6,2,4,3};
		s.insorting(arr);
	}
} // Contributed by Amresh Ranjan.
