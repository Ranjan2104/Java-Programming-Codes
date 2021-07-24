package Java;
public class mergsort {
	// driver code
	int[] array;
	int[] tempmergArr;
	int length, middle, i, j, k;
	
	public static void main(String[] args) {
		int[] inputArr = {5,6,1,3,2,4};
		mergsort ms = new mergsort();
		ms.sort(inputArr);
		for(int i : inputArr)
		{
			System.out.print(i + " ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempmergArr = new int[length];
		divideArray(0, length-1);
	}
	public void divideArray(int lowerindex, int higherindex)
	{
		if(lowerindex < higherindex)
		{
			middle = lowerindex + (higherindex - lowerindex) / 2;
			divideArray(lowerindex, middle);
			divideArray(middle+1, higherindex);
			mergArray(lowerindex, middle, higherindex);
		}
	}
	public void mergArray(int lowerindex, int middle, int higherindex)
	{
		for(int i = lowerindex; i <= higherindex; i++)
		{
			tempmergArr[i] = array[i];
		}
		i = lowerindex;
		j = middle + 1;
		k = lowerindex;
		while(i <= middle && j <= higherindex)
		{
			if(tempmergArr[i] <= tempmergArr[j])
			{
				array[k] = tempmergArr[i];
				i++;
			}
			else
			{
				array[k] = tempmergArr[j];
				j++;
			}
			k++;
		}
		while(i <= middle)
		{
			array[k] = tempmergArr[i];
			k++;
			i++;
		}
	}
} // Contributed by Amresh Ranjan.
