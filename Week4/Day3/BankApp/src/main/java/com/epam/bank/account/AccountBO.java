/**
 * Model class for account
 */
package com.epam.bank.account;
/**
 * 
 * @author Ananya_Goel
 *
 */
public class AccountBO {

	private String clientName;
	private int age;
	private String address;
	private String fatherName;
	private String idCardNo;
	private String accountType;
	private int balance;
	private static final int MAX_BALANCE_LIMIT=1000000;
	private static final int MIN_BALANCE=5000;
	
	public AccountBO(String clientName, String idCardNo, String accountType, int balance) {
		super();
		this.clientName = clientName;
		this.idCardNo = idCardNo;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMAX_BALANCE_LIMIT() {
		return MAX_BALANCE_LIMIT;
	}
	
	
	
}
