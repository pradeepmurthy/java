/**
 * 
 */
package com.psin.myapp.model;

import java.io.Serializable;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author psindhanur
 *
 */
public class Account implements Serializable {

	private String accountName;
	private Long cardNumber;
	private HashMap<String, byte[]> personsMap;
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public HashMap<String, byte[]> getPersonsMap() {
		return personsMap;
	}
	public void setPersonsMap(HashMap<String, byte[]> personsMap) {
		this.personsMap = personsMap;
	}
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", cardNumber=" + cardNumber + ", personsMap=" + personsMap.size()
				+ "]";
	}

	
}
