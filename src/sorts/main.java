package sorts;

public class main {

	public static void main(String[] args) {

		IntQuickSort quicksort = new IntQuickSort();
		int [] arr = {2,5,1,7};
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			System.out.print("\n");
		quicksort.quicksort(arr, 0, arr.length-1);
		
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			System.out.print("\n");
	}

}

