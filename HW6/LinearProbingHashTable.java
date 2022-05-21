import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 
 * @author senhai
 *
 * @param <K>
 * @param <V>
 */
public class LinearProbingHashTable<K, V> implements GradableMap<K, V> {
	
	private HashTableEntry[] entry;
	private double maxLoadFactor;
	private int size;
	
	/**
	 * This is a constructor 
	 * It takes in no parameters and use 11 as the size and .75 as the maxLoadFactor. 
	 */
	public LinearProbingHashTable(){
		// TODO Auto-generated method stub
		entry = new HashTableEntry[11];
		size = 0;
		maxLoadFactor = 0.75;
		
		
	}
	
	/**
	 * This is a constructor 
	 * It takes size as the size and .75 as the maxLoadFactor. 
	 */
	public LinearProbingHashTable(int size){
		// TODO Auto-generated method stub
		entry = new HashTableEntry[size];
		this.size = 0;
		maxLoadFactor = 0.75;
		
	}
	
	/**
	 * This is a constructor 
	 * It takes size as the size and loadFactor as the maxLoadFactor. 
	 */
	public LinearProbingHashTable(int size, double loadFactor){
		// TODO Auto-generated method stub
		entry = new HashTableEntry[size];
		this.size = 0;
		maxLoadFactor = loadFactor;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(HashTableEntry<K,V> i :entry) 
			i=null;	
		this.size=0;
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return this.keySet().contains(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		for(HashTableEntry<K,V> i :entry) 
			if(i!=null&&i.getValue().equals(arg0)) return true;
		return false;
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> e_set=new HashSet();
		for(HashTableEntry<K,V> i :entry) 
			if(i!=null) 
				e_set.add(i);			
		return e_set;
	}

	@Override
	public V get(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0==null)
			throw new NullPointerException("searching object can't be null");
        for (int i = arg0.hashCode()%entry.length; entry[i] != null; i = (i + 1) % entry.length) 
            if (entry[i].getKey().equals(arg0))
                return (V) entry[i].getValue();
        return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		Set<K> K_set=new HashSet<K>();
		for(HashTableEntry<K,V> i :entry) 
			if(i!=null) 
				K_set.add(i.getKey());
		return K_set;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		if(key==null) throw new NullPointerException("key can't be null");
		
		//Check the index place where it hashed.
		//if it is a null, put an entry with (key, value)
		//if it contains an object, and keys are equal set entry with new value
		//otherwise check the next index place
		int temp=key.hashCode()%entry.length;
		int i=temp;
		do {
			if(entry[i]==null) {
				entry[i]=new HashTableEntry<K,V>(key,value);			
				size++;
				return null;
			}
			if(entry[i].getKey().equals(key)) {
				V v=(V) entry[i].getValue();
				entry[i].setValue(value);
				return v;
			}
			i=(i+1)%entry.length;
		}while(i!=temp);
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> otherMap) {
		// TODO Auto-generated method stub
		for(Entry i : otherMap.entrySet()) {
			put((K)i.getKey(),(V)i.getValue());
		}		
	}


	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		if(key==null)
			throw new NullPointerException("remove object can't be null");
		//if entry doesn't contains key return null
		if (!containsKey(key)) return null; 
		
		//check the hashcode's index if its key match key, if not check the next one
		int i=key.hashCode()%entry.length;
		while(!key.equals(entry[i].getKey())) {
			i=(i+1)%entry.length;
		}
		//set the found entry[i] to null and record its value
		V v=(V) entry[i].getValue();
		entry[i]=null;
		
		//rehash the entry[i] until the next place is a null
		for(i=(i+1)%entry.length;entry[i]!=null;i=(i+1)%entry.length) {
			K k1=(K) entry[i].getKey(); 
			V v1=(V) entry[i].getValue();
			entry[i]=null;
			this.size--;
			put(k1,v1);
		}
		this.size--;
		return v;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		ArrayList<V> v=new ArrayList<V>();
		for(HashTableEntry<K,V> i :entry) 
			if(i!=null) 
				v.add(i.getValue());
		return v;
	}

	@Override
	public HashTableEntry<K, V>[] getArray() {
		// TODO Auto-generated method stub
		return this.entry;
	}

	@Override
	public void setArray(HashTableEntry<K, V>[] array) {
		// TODO Auto-generated method stub
		this.entry=array;		
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		this.size=size;
		
	}

}
