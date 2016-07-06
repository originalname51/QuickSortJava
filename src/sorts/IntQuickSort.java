package sorts;
/*
 * Implementation of quicksort from wikipedia to better understand how it works.
 * https://en.wikipedia.org/wiki/Quicksort
 * 
 * */
public class IntQuickSort {
	
	IntQuickSort(){};
	
 public void quicksort(int arr[], int lo, int hi)
	{
	 if(lo < hi)
	 {
		 int p;
		 p = _partition(arr, lo, hi);
		 quicksort(arr, lo, p-1);
		 quicksort(arr, p+1, hi);
	 }		
	}
	
private int _partition(int arr[] , int lo, int hi)
{
	
	int pivot = arr[hi];
	int     i = lo;

	int temp;
	
	
	for(int j = lo; j < hi; j++)
	{
		if(arr[j] <= pivot)
		{
			temp   = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			     i = i+1;
		}
	}
	
	temp    = arr[i];
	arr[i]  = arr[hi];
	arr[hi] = temp;
	return i;
}

}
