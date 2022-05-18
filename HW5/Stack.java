
/**
 * This is Home Work 5, Stack 
 * @author senhai
 *
 * @param <V>
 */
public class Stack<V>
{

	private V[] data;
	private int maxSize;
	private int top;
	
    /**
        Constructor to initialize the stack with a maximum capacity of maxSize.
    */
    @SuppressWarnings("unchecked")
    public Stack(int maxSize)
    {	
    	this.maxSize=maxSize;
    	data= (V[]) new Object[this.maxSize];
    	top=-1;
    	
    }
 
    /**
         Pushes an item onto the top of this stack.
    */
    public void push(V element) 
    {
    	if(top>=maxSize)  throw new IllegalStateException("out of range");
    	data[++top]=element;
    }
    
 
    /**
        Removes the object at the top of this stack and returns that object as the value of this function.
    */
    public V pop()
    
    {   
    	if(top>=maxSize||top<-1)  throw new IndexOutOfBoundsException();
    	if(top==-1) return null;
    	return data[top--];
    }
 
    /**
        Looks at the object at the top of this stack without removing it from the stack.
    */
    public V peek()
    {
    	if(top==-1) return null;
    	return data[top];
    }
 
    /**
        Returns the number of items currently in the stack
    */
    public int currentSize() {
    	return top +1;
    }
 
    /**
        Tests if this stack is empty.
    */
    public boolean isEmpty() {
    	return top==-1;
    }
 
    /**
        Tests if this stack is full
    */
    public boolean isFull() {
    	return top==maxSize-1;
    }
    
}