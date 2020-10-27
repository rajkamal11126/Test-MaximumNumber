package com.bridgelabz.testmaxnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	// TC-1.1
	@Test
	public void givenMaxIntegerNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(45, 32, 21);
		Assert.assertEquals((Integer) 45, result);
	}

	// TC-1.2
	@Test
	public void givenMaxIntegerNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(20, 60, 21);
		Assert.assertEquals((Integer) 60, result);
	}

	// TC-1.3
	@Test
	public void givenMaxIntegerNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maxNumber(60, 70, 80);
		Assert.assertEquals((Integer) 80, result);
	}

	// TC-2.1
	@Test
	public void givenMaxFloatNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
		Float result = MaximumNumber.maxNumber(45.5f, 32.5f, 21.5f);
		Assert.assertEquals((Float) 45f, result);
	}

	// TC-2.2
	@Test
	public void givenMaxFlatNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
		Float result = MaximumNumber.maxNumber(20.3f, 60.5f, 21.6f);
		Assert.assertEquals((Float) 60.5f, result);
	}

	// TC-2.3
	@Test
	public void givenMaxFloatNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
		Float result = MaximumNumber.maxNumber(60.1f, 70.2f, 80.3f);
		Assert.assertEquals((Float) 80.3f, result);
	}

	// TC-3.1
	@Test
	public void givenMaxStringAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
		String result = MaximumNumber.maxNumber("Wipro", "Bridgelabz", "Cognizant");
		Assert.assertEquals("Wipro", result);
	}

	// TC-3.2
	@Test
	public void givenMaxStringAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
		String result = MaximumNumber.maxNumber("Blue", "White", "Green");
		Assert.assertEquals("White", result);
	}

	// TC-3.3
	@Test
	public void givenMaxStringAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
		String result = MaximumNumber.maxNumber("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", result);
	}
}
