package Java;
class search
{
	public void binsrch(int arr[], int item)
	{
		int f = 0 , l = arr.length;
		int mid = (f + l) / 2;
		while(f <= l)
		{
			if(arr[mid] == item)
			{
				System.out.println("item found at index of " + mid);
				break;
			}
			else if(arr[mid] < item)
			{
				f = mid +1;
				System.out.println("f --> " + f);
			}
			else
			{
				l = mid -1;
				System.out.println("l --> " + l);
			}
			mid = (f + l) / 2;
			System.out.println("mid --> " + mid );
		}
		if(f > l)
			System.out.println("no found item !");
	}

}
public class binarysearch {

	public static void main(String[] args) {
		search sc = new search();
		int arr[] = {2,4,6,8,10,12,14};
		int item = 6;
		sc.binsrch(arr, item);

	}

} // Contributed by Amresh Ranjan.
