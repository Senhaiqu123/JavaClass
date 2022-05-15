import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * This is Home Work 4, LinkedList
 * @author senhai
 *
 * @param <T>
 */
public class LinkedList<T> implements List<T> {
	
	private Node head=null, tail=null;    // These are always the first and last nodes
	
	private int size=0 ;                  // This is the number of items in the list
	
	
	//This is a Node class class inside of LinkedList class
	private class Node {
		Node next , prev ;
		T data ;
		public Node(T data) {
			this.data=data;
		}
	}
	
	
	public LinkedList () {
		// Do nothing .
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		Node newNode = new Node(item); 
		
		// If list is empty, newNode will be the only element, and it is also head and tail
		 if(size==0) {
			 	head=newNode;
			 	tail=newNode;
	            size++;
		 }
		 
		 //If list is not empty, add newNode at the end of the list
		 else {  
			 tail.next=newNode;
			 newNode.prev= tail;  
			 tail= newNode;
			 size++;
		 }
	            
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head=null;tail=null;
		size=0;

	}

	@Override
	//check all the items in the list if find a match return true otherwise return false
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		
		Node n=head;
		while(n.next!=null) {
			if(n.data.equals(item)) return true;
			n=n.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public T remove(Object item) {
		// TODO Auto-generated method stub
		
		// In case head is the item
		if(head.data.equals(item)){
				T data=head.data;
				head.next.prev=null;
				head=head.next;
		}
		
		// In case tail is the item
		else if(tail.data.equals(item)) {
			T data=tail.data;
			tail.prev.next=null;
			tail=tail.prev;
		}
		
		// Try to find the item in the body and delete it
		else {		
			Node n=head.next;
			for(int i=1;i<size-1;i++) {
				if(n.data.equals(item)) {
					n.prev.next=n.next;
					n.next.prev=n.prev;
				}
				n=n.next;
			}
		}	
		return (T)item;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Iterator<T> it= new Iterator<T>() {
			
			private int Index=0;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return size>Index;				
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return head.next.data;
			}
			
		};
		return it;
	}

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		
		//If add an item out of list range throw  an exception
		if(index<0||index>size) 
			throw new IndexOutOfBoundsException();
		
		Node current=head;
		Node newNode=new Node(item);
		
		//If add the item at the beginning 
		if(index==0) {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
			size++;
		}
		
		//If add the item after head, find the Node before index place, put the item after this Node
		else {
			for(int i=0;i<index-1;i++)
				current=current.next;
			newNode.next=current.next;			
			newNode.prev=current;
			current.next=newNode;

			size++;
		}
			


	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		// If index is out of the list's range
		if(index<0||index>size) 
			throw new IndexOutOfBoundsException();
		
		// Traversal the list to the index place, return the data of that node 
		Node current=head;
//		if(index==0) return current.data;
		for(int i=0;i<index;i++)
			current=current.next;
		return current.data;
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		
		// Check all Node's data, if find a match return its index otherwise return -1
		Node current=head;
		for(int i=0;i<size;i++) {
			if(current.data.equals((T)item)) return i;
			current=current.next;
		}	
		return -1;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		Node current=head;
		
		// If remove an item out of list's range throw  an exception
		if(index<0||index>size) 
			throw new IndexOutOfBoundsException();
		
		// If remove an item at the beginning
		if(index==0) {
			head.next.prev=null;
			head=head.next;
			size--;
		}
		
		// If remove an item at the end
		else if(index==size-1) {
			
			current=tail;  //store tail's data so we can return later
			
			tail.prev.next=null;
			tail=tail.prev;
			size--;
		}
		// Remove an item between head and tail
		else {
			for(int i=0;i<index;i++)
				current=current.next;
			current.next.prev=current.prev;
			current.prev.next=current.next;
			size--;
			
		}
		return current.data; // Return the data of removed element
	}

	/**
	 * @return the first item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T getFirst() {
		// TODO method stub
		return head.data;
	}

	/**
	 * @return the last item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T getLast() {
		// TODO method stub
		return tail.data;
	}

	/**
	 * Adds 'item' to front of this linked list
	 * 
	 * @param item
	 */
	public void addFirst(T item) {
		// TODO method stub
		Node newNode=new Node(item);
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		size++;
	}

	/**
	 * Adds 'item' to the end of this linked list
	 * 
	 * @param item
	 */
	public void addLast(T item) {
		// TODO method stub
		Node newNode=new Node(item);
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
		size++;
	}

	/**
	 * Removes and returns the first item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T removeFirst() {
		// TODO method stub
		if(size==0) 
				throw new NoSuchElementException();
		T data=head.data;
		head.next.prev=null;
		head=head.next;
		size--;
			
		return data;
	}

	/**
	 * Removes and returns the last item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T removeLast() {
		// TODO method stub
		if(size==0) 
			throw new NoSuchElementException();
		T data=tail.data;
		tail.prev.next=null;
		tail=tail.prev;
		size--;
				
		return data;
	}
}
