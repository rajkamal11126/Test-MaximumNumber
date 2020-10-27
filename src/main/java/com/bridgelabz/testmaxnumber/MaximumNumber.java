package com.bridgelabz.testmaxnumber;

public class MaximumNumber {
	//comparing three numbers
	public static Integer maxNumber(Integer x, Integer y, Integer z) {
		if(x > y && x > z)
        {
            System.out.println("Maximum number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Maximum number is:"+y);
        }
        else
        {
            System.out.println("Maximum number is:"+z);
        }
		return z;
	}
}
