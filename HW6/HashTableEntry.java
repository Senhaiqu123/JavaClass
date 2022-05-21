import java.util.Map.Entry;
/**
 * 
 * @author senhai
 *
 * @param <K>
 * @param <V>
 */
public class HashTableEntry<K,V> implements Entry<K, V> {
	private K key;
	private V value;
	private boolean available;

	public HashTableEntry(K key, V value){
		// TODO Auto-generated method stub
		this.key=key;
		this.value=value;
		this.available=false;
	}
	
	public boolean isAvailable(){
		// TODO Auto-generated method stub
		return this.available;
	}
	
	public void setAvailable(boolean isAvailable){
		// TODO Auto-generated method stub
		this.available=isAvailable;
	}

	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		V v=this.value;
		this.value=value;
		return v;
	}
	
	@Override
	public int hashCode(){
		// TODO Auto-generated method stub		
		return key.hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		HashTableEntry<K,V> e= (HashTableEntry<K, V>) o;
		return (e.key.equals(this.key)&&e.value.equals(this.value));
	}
}
