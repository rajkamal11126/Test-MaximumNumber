package com.bridgelabz.testmaxnumber;

public class MaximumNumber {
	// UC-1 comparing three integer numbers
	public static Integer maxNumber(Integer x, Integer y, Integer z) {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + x);
		} else if (y.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + y);
		} else {
			System.out.println("Maximum number is:" + z);
		}
		return z;
	}

	// UC-2 comparing three float numbers
	public static Float maxNumber(Float x, Float y, Float z) {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + x);
		} else if (y.compareTo(z) > 0) {
			System.out.println("Maximum number is:" + y);
		} else {
			System.out.println("Maximum number is:" + z);
		}
		return z;
	}

	// UC-3 comparing three string
	public static String maxNumber(String s1, String s2, String s3) {
		if (s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0) {
			System.out.println("Maximum number is:" + s1);
		} else if (s2.compareTo(s3) > 0) {
			System.out.println("Maximum number is:" + s2);
		} else {
			System.out.println("Maximum number is:" + s3);
		}
		return s3;
	}
}
