package edu.csupomona.cs356.setdemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InstrumentedSet<E> extends HashSet<E> implements Set<E> {

	private int counter = 0;
	
	public int getCounter() {
		return counter;
	}
	
	public int size() {		
		return super.size();
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public boolean contains(Object o) {
		return super.contains(o);
	}

	public Iterator<E> iterator() {
		return super.iterator();
	}

	public Object[] toArray() {
		return super.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return super.toArray(a);
	}

	public boolean add(E e) {
		counter++;
		return super.add(e);
	}
	
	public boolean addAll(Collection<? extends E> c) {
		counter += c.size();
		return super.addAll(c);
	}

	public boolean remove(Object o) {
		return super.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return super.containsAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return super.retainAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return super.removeAll(c);
	}

	public void clear() {
		super.clear();
	}

	public static void main(String[] args) {
		InstrumentedSet<String> set = new InstrumentedSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.addAll(Arrays.asList(new String[]{"D", "E", "F"}));
		
		System.out.println(set.getCounter());
	}
}
