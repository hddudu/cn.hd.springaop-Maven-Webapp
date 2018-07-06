package com.datastructure;

/**
 * @author dudu
 *
 * @param <K>
 * @param <V>
 */
public interface MyMap<K, V> {
	
	public V get(K k);
	
	public V put(K k, V v);
	
	interface Entry<K, V>{
		public K getKey();
		public V getValue();
	}
}
