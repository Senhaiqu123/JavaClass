
/**
 * This is Home Work 5, Queue 
 * @author senhai
 *
 * @param <V>
 */
public class Queue<V> {
	
	private V[] data;
	private int frontIndex;
	private int size;

    /**
    * Constructor to initialize the queue with a maximum capacity of maxSize.
    */
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
    	data=(V[]) new Object[maxSize];
    }

    /**
        Returns the maximum size this queue can support.
    */
    public int getMaxSize() {
    	return data.length;
    }

     /**
        Returns the current number of items enqueued.
    */
    public int getCurrentSize() {
    	return size;
    }

    /**
        Returns true if there are no elements in the queue.
    */
    public boolean isEmpty() {
    	return size==0;
    }

    /**
        Returns true if the queue is size is at max size.
    */
    public boolean isFull() {
    	return size==data.length;
    }

    /**
        Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    */
    public V peek() {
    	if(size==0) return null;
    	return data[frontIndex];    			
    }
    
   /**
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
    */
    public void add(V value) {
    	if(size>=data.length) throw new IllegalStateException("no more space");
    	int currentIndex= (frontIndex+size)%data.length;
    	data[currentIndex]=value;
    	size++;
    }

    /**
        Retrieves and removes the head of this queue, or returns null if this queue is empty.
    */
    public V poll() {
    	if(size==0) return null;
    	V out=data[frontIndex];
    	data[frontIndex]=null;
   	 	frontIndex=(frontIndex+1)%data.length;
   	 	size--;
   	 return out;
    }
    
    /**
        Retrieves and removes the head of this queue.
    */
     public V remove() {
    	 if(size==0) throw new IllegalStateException("It is empty");
    	 V out=data[frontIndex];
    	 data[frontIndex]=null;
    	 frontIndex=(frontIndex+1)%data.length;
    	 size--;
    	 return out;
    }
    
}