/**
 * This is Home Work 7, BasicTraning
 * @author senhai
 *
 */
public class BasicTraining {

	/**
	 * Sort the array using quick sort, this must be:
	 * 
	 * in-place (no temporary arrays)
	 * O(n log n)
	 * 
	 * @param array
	 * @return a sorted array
	 */
	
	public static <T extends Comparable<? super T>> int partition(T arr[], int begin, int end) {
	    T pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j].compareTo(pivot)<=0) {
	            i++;
	            T Temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = Temp;
	        }
	    }

	    T Temp = arr[i+1];
	    arr[i+1] = pivot;
	    arr[end] = Temp;

	    return i+1;
	}
	
	
	public static <T extends Comparable<? super T>> T[] quickSort1(T[] array,int begin,int end) {
	    if (begin < end) {
	        int partitionIndex = partition(array, begin, end);

	        quickSort1(array, begin, partitionIndex-1);
	        quickSort1(array, partitionIndex+1, end);
	    }
	    return array;
	}
	
	
	public static <T extends Comparable<? super T>> T[] quickSort(T[] array) {
		return quickSort1(array,0,array.length-1);	
	}
	
	
}
