/**
 * This is Home Work3, ArrayList
 * @author senhai
 *
 * @param <T> generic data type
 */
public class ArrayList<T> implements List<T> {

	private static final int DEFAULT_INITIAL_CAPACITY = 11;
	private T[] data;  //This stores the items added to the List.
	private int size;  //This keeps track of how many items have been added to the List.
	
	
	

	/**
	 * Constructs an ArrayList using the default capacity
	 */
	public ArrayList() {
		// TODO Complete Constructor
		data= (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
		size=0;

	}
	

	/**
	 * Constructs an ArrayList with an 'initialCapacity'
	 * 
	 * If 'initalCapacity' is non-positive use the default capacity
	 * 
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		// TODO Complete Constructor
		data= (T[]) new Object[initialCapacity];
		size=0;
		
	}
	
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		if(index<0||index>size)
			throw new IndexOutOfBoundsException();
		
		//if data is full, double the capacity
		T[] data2;
		if(size+1>data.length) {
			data2= (T[]) new Object[data.length*2];
			System.arraycopy(data, 0, data2, 0, size);
			data=data2;			
		}
		
		//shift the array, and assign the item to its index
		for(int i=size;i>index;i--)
			data[i]=data[i-1];
		data[index]=item;
		size++;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(T i :  data)
			i=null;
		size=0;
	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		for(T i: data)
			if(i==item) return true; 
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if(index>size||index<0) 
			throw new IndexOutOfBoundsException();
		if(data[index]!=null) 
			return data[index];
		return null;
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub

		for(int i=0;i<size;i++)
			if(data[i].equals(item)) return i;
		return -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(size!=0) return size;
		return 0;
	}
}
