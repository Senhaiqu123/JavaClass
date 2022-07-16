/**
 * This is Home Work 7, MissionThree
 * @author senhai
 *
 */
public class MissionThree {

	/**
	 * Merges two sorted arrays, and computer the difference in scores
	 * 
	 * @param person1 a sorted array of medals
	 * @param person2 a sorted array of medals
	 * @return the difference in score of person1 and person2
	 */
	public static <T extends Comparable<? super T>> int merge(T[] person1, T[] person2) {
		
		T[] person=(T[]) new Object [person1.length+person2.length];
	    int i = 0, j = 0, k = 0, sum1=0,sum2=0;
	    while (i < person1.length && j < person2.length) {
	        if (person1[i].compareTo(person2[j])<0) {
	            person[k++] = person1[i++];
	            sum1+=k;
	        }
	        else {
	            person[k++] = person2[j++];
	            sum2+=k;
	        }
	    }
	    while (i < person1.length) {
	        person[k++] = person1[i++];
	        sum1+=k;
	    }
	    while (j < person2.length) {
	        person[k++] = person[j++];
	        sum2+=k;
	    }
	    return Math.abs(sum1-sum2);
	    
	}
	
}
