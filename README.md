# QuickSortJava
Quick Sort Implementation Using Java

This is a quick sort implementation using wikipedia's pseudocode from the Lomuto partition scheme.
https://en.wikipedia.org/wiki/Quicksort

Pseudocode (from wikipedia - format is a bit messy. It's two functions, quicksort and partition) below:

    algorithm quicksort(A, lo, hi) is
    if lo < hi then
        p := partition(A, lo, hi)
        
        quicksort(A, lo, p – 1)
        
        quicksort(A, p + 1, hi)
        
    algorithm partition(A, lo, hi) is
    pivot := A[hi]
    i := lo        // place for swapping
    for j := lo to hi – 1 do
        if A[j] ≤ pivot then
        
            swap A[i] with A[j]
            
            i := i + 1
            
    swap A[i] with A[hi]
    return i
    
    

The test are in the test folder. Main will sort an array.

