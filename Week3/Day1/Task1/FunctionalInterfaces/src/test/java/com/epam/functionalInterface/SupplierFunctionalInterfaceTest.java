package com.epam.functionalInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.epam.functionalinterface.supplier.CurrentDate;

class SupplierFunctionalInterfaceTest {

	/**
	 * Test method for {@link com.epam.functionalinterface.supplier.CurrentDate#currentDateSupplier}.
	 */
	@Test
	void testCurrentDateSupplier() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		assertEquals(dtf.format(LocalDateTime.now()), CurrentDate.currentDateSupplier());
	}

}
