package edu.csupomona.cs356.set;

import java.util.Collection;
import java.util.Set;

public class CompInstrumentedHashSet<E> extends ForwardingSet<E> {

	private int addCount = 0;

	public CompInstrumentedHashSet(Set<E> s) {
		super(s);
	}

	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
