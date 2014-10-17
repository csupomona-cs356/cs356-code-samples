package edu.csupomona.cs356.setdemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InstrumentedSet2<E> implements Set<E> {

	private int counter = 0;
	
	public int getCounter() {
		return counter;
	}
	
	private Set<E> forwardingSet = new HashSet<E>();
	
	public int size() {
		return forwardingSet.size();
	}

	public boolean isEmpty() {
		return forwardingSet.isEmpty();
	}

	public boolean contains(Object o) {
		return forwardingSet.contains(o);
	}

	public Iterator<E> iterator() {
		return forwardingSet.iterator();
	}

	public Object[] toArray() {
		return forwardingSet.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return forwardingSet.toArray(a);
	}

	public boolean add(E e) {
		counter++;
		return forwardingSet.add(e);
	}

	public boolean addAll(Collection<? extends E> c) {
		counter += c.size();
		return forwardingSet.addAll(c);
	}

	public boolean remove(Object o) {
		return forwardingSet.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return forwardingSet.containsAll(c);
	}
	
	public boolean retainAll(Collection<?> c) {
		return forwardingSet.retainAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return forwardingSet.removeAll(c);
	}

	public void clear() {
		forwardingSet.clear();
	}

	public static void main(String[] args) {
		InstrumentedSet2<String> set = new InstrumentedSet2<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.addAll(Arrays.asList(new String[]{"D", "E", "F"}));
		
		System.out.println(set.getCounter());
	}
}
