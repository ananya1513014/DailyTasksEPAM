/**
 * This class contains methods to be performed on AccountBO class
 */
package com.epam.bank.account;

import com.epam.bank.exceptions.NotEnoughBalanceException;
import com.epam.bank.exceptions.OverBalanceLimitException;
import com.epam.bank.exceptions.WrongDataException;

/**
 * @author Ananya_Goel
 */
public class AccountServices {

	/**
	 * @param clientName
	 * @param idCardNo
	 * @param accountType
	 * @param openingBalance
	 * @return AccountBO object
	 * @throws WrongDataException
	 */
	public static AccountBO createAccount(String clientName, String idCardNo, String accountType, int openingBalance)
															throws WrongDataException 
	{
		if(clientName.length()<4||idCardNo.length()<10||accountType.length()<2||openingBalance<5000)
			throw new WrongDataException("Wrong Data!\nAccount creation not possible");
		
		return new AccountBO(clientName, idCardNo, accountType, openingBalance);
	}

	/**
	 * @param AccountBO object
	 * @param depositAmount
	 * @return AccountBO object
	 * @throws OverBalanceLimitException
	 */
	public static AccountBO addBalance(AccountBO accountObj, int depositAmount) throws OverBalanceLimitException {
		
		if(accountObj.getBalance() + depositAmount > accountObj.getMAX_BALANCE_LIMIT())	
			throw new OverBalanceLimitException("Account Balance Limit Reached!\nDeposit function aborting...");

		accountObj.setBalance(accountObj.getBalance()+depositAmount);
		
		return accountObj;
	}

	/**
	 * 
	 * @param AccountBO object
	 * @param withdrawalAmount
	 * @return AccountBO object
	 * @throws NotEnoughBalanceException
	 */
	public static AccountBO withdrawBalance(AccountBO accountObj, int withdrawalAmount) throws NotEnoughBalanceException {
		
		if(accountObj.getBalance()<withdrawalAmount)	
			throw new NotEnoughBalanceException("Not enough balance available\nWithdrawal not possible");
		
		accountObj.setBalance(accountObj.getBalance()-withdrawalAmount);
		
		return accountObj;
	}

}
