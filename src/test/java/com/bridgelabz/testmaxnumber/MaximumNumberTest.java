package com.bridgelabz.testmaxnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	// TC-1
	@Test
	public void givenMaxNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(45, 32, 21);
		Assert.assertEquals((Integer) 45, result);
	}

	// TC-2
	@Test
	public void givenMaxNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(20, 60, 21);
		Assert.assertEquals((Integer) 60, result);
	}

	// TC-3
	@Test
	public void givenMaxNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(60, 70, 80);
		Assert.assertEquals((Integer) 80, result);
	}

}
