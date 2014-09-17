package edu.csupomona.cs356.inter;

//void aMethod(int aValue) {
//System.out.println("Hello World!");
//}

public interface TestInterface2 {

	void aMethodFix0(int aValue);
	
	// incorrect!
	// protected aMethodFix1(int aValue);
	
	abstract void aMethodFix2(int aValue);
	
	// correct in JDK 8
	static void aMethodFix3(int aValue) {
		System.out.println("Hello World!");
	}
	
	// correct in JDK 8
	default void aMethodFix4(int aValue) {
		System.out.println("Hello World!");
	}
}
