package edu.csupomona.cs356.set;

import java.util.Arrays;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>(10, 10);
		set.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(set.getAddCount());
		
		CompInstrumentedHashSet<String> set2 = new CompInstrumentedHashSet<String>(new HashSet<String>());
		set2.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(set2.getAddCount());
	}

}
