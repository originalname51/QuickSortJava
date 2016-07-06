package sorts;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class Test_quick {

	@Test
	public void test() {
		
		final int RANDOM_TEST_RUNS = 5;
		
		IntQuickSort testObject = new IntQuickSort();
		int A[] = {0,0,0,0,0,0,0,0,0,0};
		int B[] = {1,2,3,4,5,6,7,8,9,10};
		int C[] = {10,9,8,7,6,5,4,3,2,1};
		int lo = 0;
		testObject.quicksort(A, lo, A.length-1);
		assertTrue(A[0] == 0);
		
		testObject.quicksort(B, lo, B.length-1);
		assertTrue(B[5] == 6);
		
		assertTrue(C[0] == 10);
		testObject.quicksort(C, lo, C.length-1);
		for(int i = 0; i < C.length;i++)
		{
			assertTrue(B[i] == C[i]);
		}
		
		Random ran = new Random();
		for (int i = 0; i < RANDOM_TEST_RUNS;i++)
		{
			RandomTest(ran.nextInt(21474836));
		}
		RandomTest(21474836);
	}
	
/*
 * Randomly test array
 * */	
void RandomTest(int randNumRange)
{

	Random ran = new Random();
	int randomSize = ran.nextInt(randNumRange);
	int randomArray[] = new int[randomSize];
	IntQuickSort testRandomSort = new IntQuickSort();
	int lo = 0;
	
	for(int i = 0; i < randomArray.length; i++)
	{
		randomArray[i] = ran.nextInt(Integer.MAX_VALUE);
	}
	
	testRandomSort.quicksort(randomArray, lo, randomArray.length-1);
	
	for(int i = 1; i < randomArray.length; i++)
	{
		assertTrue(randomArray[i] >= randomArray[i-1]);
	}

}

}

