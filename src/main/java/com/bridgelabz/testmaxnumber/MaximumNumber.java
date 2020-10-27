package com.bridgelabz.testmaxnumber;

public class MaximumNumber {

	public static <T extends Comparable<T>> T compare (T x, T y, T z) {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + x);
		} else if (y.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + y);
		} else {
			System.out.println("Maximum number is:" + z);
		}
		return z;
	}

	
}
