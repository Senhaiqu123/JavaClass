/**
 * This is Home Work 7, MissionTwo
 * @author senhai
 *
 * @param <T>
 */

public class MissionTwo<T extends Comparable<? super T>> {

	private T[] data;
	int size=0;
	
	/**
	 * Default Constructor
	 */
	public MissionTwo(int maxCapacity) {
		// TODO Constructor
		data=(T[]) new Object [maxCapacity];
	}
	
	/**
	 * Adds the item to the structure, must be
	 * 
	 * in-place
	 * stable
	 * O(n)
	 * 
	 * @param item
	 * @throws Exception 
	 */
	public void add(T item) throws Exception {
		
		// TODO Method
	    if(size==data.length) throw new Exception("Data is full");
	    
		if(size==0) data[0]=item;
		
		int index=0;
		while(data[index].compareTo(item)<0) {
			index++;
		}	
			
			T[] data2=(T[]) new Object [data.length];
			for(int i=0;i<index;i++)
				data2[i]=data[i];
			data2[index]=item;
			for(int j=index+1;j<=size;j++)
				data2[j]=data[j-1];
			
			data=data2;
		size++;	
		
	}
	
	/**
	 * This must return the smallest element in this structure, must be
	 * 
	 * in-place
	 * stable
	 * O(1)
	 * 
	 * @return the smallest element currently in this structure
	 * @throws Exception 
	 */
	public T remove() throws Exception {
		T item=data[0];
		if(size==0) 
			 throw new Exception("Data is empty"); 
		T[] data2=(T[]) new Object [data.length];
		for(int i=1;i<=size;i++)
			data2[i-1]=data[i];
		data=data2;
		size--;
		return item;
		
	}
	
}
