package Java;
class heapsort
{
	int leng, temp, largest, li, ri;
	public void sort(int arr[])
	{
		leng = arr.length;
		for(int i = leng/2-1; i>=0; i--)
			heapify(arr, leng, i);
		for(int i = leng-1; i >= 0; i--)
		{
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public void heapify(int arr[], int n, int i)
	{
		largest = i;
		li = 2*i + 1;
		ri = 2*i + 2;
		if(li < n && arr[li] > arr[largest]) largest = li;
		if(ri < n && arr[ri] > arr[largest]) largest = ri;
		if(largest != i)
		{
			temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}	
	}
	public void printarray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
public class Sortingheap {

	public static void main(String[] args) {
		int arr[] = {22,13,17,11,10,14,12};
		helloheap hs = new helloheap();
		hs.sort(arr);
		hs.printarray(arr);
		
	}
} // Contributed by Amresh Ranjan.
