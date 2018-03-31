package com.demo;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

public class Euler1 {

	public int sumMultiplesOf3And5Until(int num) {
		return IntStream.range(1,num).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
	}
	
	@Test
	public void sumUntil0ShouldBe0() {
		assertEquals(0, sumMultiplesOf3And5Until(0));
	}
	
	@Test
	public void sumUntil3ShouldBe0() {
		assertEquals(0, sumMultiplesOf3And5Until(3));
	}
	
	@Test
	public void sumUntil4ShouldBe3() {
		assertEquals(3, sumMultiplesOf3And5Until(4));
	}
	
	@Test
	public void sumUntil6ShouldBe8() {
		assertEquals(8, sumMultiplesOf3And5Until(6));
	}
	
	@Test
	public void sumUntil10ShouldBe23() {
		assertEquals(23, sumMultiplesOf3And5Until(10));
	}
	
	@Test
	public void sumUntil16ShouldBe60() {
		assertEquals(60, sumMultiplesOf3And5Until(16));
	}

}
