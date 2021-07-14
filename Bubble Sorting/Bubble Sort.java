package Java;
class bs
{
	public void bubblesort(int arr[])
	{
		int temp;
		for(int i = 0; i < arr.length-1; i++)
		{
			int sorted = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = 1;
				}
			}
			if(sorted == 0) break;
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
public class BubbleSort {

	public static void main(String[] args) {
		bs s = new bs();
		int arr[] = {36,19,29,12,5};
		s.bubblesort(arr);

	}
} // Contributed by Amresh Ranjan.
