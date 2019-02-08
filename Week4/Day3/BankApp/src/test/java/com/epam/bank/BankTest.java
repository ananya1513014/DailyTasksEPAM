package com.epam.bank;

/**
 * @author Ananya_Goel
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.bank.account.AccountBO;
import com.epam.bank.account.AccountServices;
import com.epam.bank.exceptions.NotEnoughBalanceException;
import com.epam.bank.exceptions.OverBalanceLimitException;
import com.epam.bank.exceptions.WrongDataException;

class BankTest {

	static AccountBO accountObj;
	
	@BeforeAll
	public static void initAccountObj() throws WrongDataException
	{
		accountObj = AccountServices.createAccount("Ananya Goel", "ABCPN5678P", "CR", 10000);
	}
	
	@Test
	public void testAddNewAccount() throws WrongDataException
	{		
		AccountBO accountObj = AccountServices.createAccount("Ananya Goel", "ABCPN5678P", "CR", 10000);
		
		assertNotNull(accountObj);
	}
	
	@Test
	public void testValues()
	{
		assertThrows(WrongDataException.class, () ->AccountServices.createAccount("AG", "ABCPN5678P", "CR", 10000));
		assertThrows(WrongDataException.class, () ->AccountServices.createAccount("Ananya Goel", "", "CR", 10000));
		assertThrows(WrongDataException.class, () ->AccountServices.createAccount("Ananya Goel", "ABCPN5678P", "", 10000));
		assertThrows(WrongDataException.class, () ->AccountServices.createAccount("Ananya Goel", "ABCPN5678P", "CR", 3000));
	}
	
	@Test
	public void testAddMoney() throws OverBalanceLimitException
	{
		int finalBalance = AccountServices.addBalance(accountObj, 5000).getBalance();
		int expectedBalance=15000;
		
		assertEquals(expectedBalance, finalBalance);
	}
	
	@Test
	public void testAddMoneyOverLimit()
	{
		assertThrows(OverBalanceLimitException.class, ()->AccountServices.addBalance(accountObj, 1000000));
	}
	
	@Test
	public void testWithdrawMoneyIfAvailable() throws NotEnoughBalanceException
	{
		accountObj.setBalance(10000);
		int finalBalance = AccountServices.withdrawBalance(accountObj, 5000).getBalance();
		int expectedBalance=5000;
		
		assertEquals(expectedBalance, finalBalance);
	}
	
	@Test
	public void testWithdrawMoneyIfNotAvailable()
	{
		assertThrows(NotEnoughBalanceException.class, ()-> AccountServices.withdrawBalance(accountObj, 15000));
	}	
}
