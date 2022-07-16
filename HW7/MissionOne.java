/**
 * This is Home Work 7, Missionone
 * @author senhai
 *
 */
public class MissionOne {

	/**
	 * Sort the array using an in-place sort, this algorithm must be:
	 * 
	 * in-place (no temporary arrays)
	 * stable
	 * O(n^2)
	 * 
	 * @param array
	 * @return array sorted
	 */
	public static <T extends Comparable<? super T>> T[] inplaceSort(T[] array) {
		
		for(int i=1;i<array.length;i++) {
			T temp=array[i];
			int j=i-1;
			while(j>-1&&array[j].compareTo(temp)>=0) {
				
				T t=array[j+1];
				array[j+1]=array[j];
				array[j]=t;
				j--;
			}
			array[j+1]=temp;
		}
		return array;
	}
	
}
