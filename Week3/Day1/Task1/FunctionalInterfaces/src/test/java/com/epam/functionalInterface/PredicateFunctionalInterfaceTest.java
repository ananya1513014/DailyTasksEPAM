/**
 * 
 */
package com.epam.functionalInterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.functionalinterface.predicate.VowelCheck;

/**
 * @author Ananya Goel
 *
 */
class PredicateFunctionalInterfaceTest {

	/**
	 * Test method for {@link com.epam.functionalinterface.predicate.VowelCheck#predicateVowelCheck(char)}.
	 */
	@Test
	void testPredicateVowelCheckForTrue() {
		assertTrue(VowelCheck.predicateVowelCheck('a'));
		assertTrue(VowelCheck.predicateVowelCheck('e'));
		assertTrue(VowelCheck.predicateVowelCheck('i'));
		assertTrue(VowelCheck.predicateVowelCheck('o'));
		assertTrue(VowelCheck.predicateVowelCheck('u'));
	}
	
	
	/**
	 * Test method for {@link com.epam.functionalinterface.predicate.VowelCheck#predicateVowelCheck(char)}.
	 */
	@Test
	void testPredicateVowelCheckForFalse() {
		assertFalse(VowelCheck.predicateVowelCheck('b'));
		assertFalse(VowelCheck.predicateVowelCheck('g'));
		assertFalse(VowelCheck.predicateVowelCheck('k'));
		assertFalse(VowelCheck.predicateVowelCheck('p'));
		assertFalse(VowelCheck.predicateVowelCheck('x'));
	}

}