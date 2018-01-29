package com.form3.services.data.payments.model;

import java.util.Objects;


public class Party   {
	
  private String accountName = null;

  private String accountNumber = null;

  private String accountNumberCode = null;

  private int accountType;

  private String address = null;

  private String bankId = null;

  private String bankIdCode = null;

  private String name = null;

  public Party accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Party accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Party accountNumberCode(String accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
    return this;
  }

  
  public String getAccountNumberCode() {
    return accountNumberCode;
  }

  public void setAccountNumberCode(String accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
  }

  public Party accountType(int accountType) {
    this.accountType = accountType;
    return this;
  }

  
  public int getAccountType() {
    return accountType;
  }

  public void setAccountType(int accountType) {
    this.accountType = accountType;
  }

  public Party address(String address) {
    this.address = address;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Party bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

 
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public Party bankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
    return this;
  }

  public String getBankIdCode() {
    return bankIdCode;
  }

  public void setBankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
  }

  public Party name(String name) {
    this.name = name;
    return this;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Party party = (Party) o;
    return Objects.equals(this.accountName, party.accountName) &&
        Objects.equals(this.accountNumber, party.accountNumber) &&
        Objects.equals(this.accountNumberCode, party.accountNumberCode) &&
        Objects.equals(this.accountType, party.accountType) &&
        Objects.equals(this.address, party.address) &&
        Objects.equals(this.bankId, party.bankId) &&
        Objects.equals(this.bankIdCode, party.bankIdCode) &&
        Objects.equals(this.name, party.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, accountNumberCode, accountType, address, bankId, bankIdCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberCode: ").append(toIndentedString(accountNumberCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankIdCode: ").append(toIndentedString(bankIdCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

