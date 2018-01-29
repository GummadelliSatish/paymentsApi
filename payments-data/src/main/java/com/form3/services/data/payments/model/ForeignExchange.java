package com.form3.services.data.payments.model;

import java.util.Objects;

public class ForeignExchange {
	private String contractReference = null;

	private String exchangeRate = null;

	private String originalAmount = null;

	private String originalCurrency = null;

	public ForeignExchange contractReference(String contractReference) {
		this.contractReference = contractReference;
		return this;
	}

	public String getContractReference() {
		return contractReference;
	}

	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}

	public ForeignExchange exchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ForeignExchange originalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
		return this;
	}

	public String getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public ForeignExchange originalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
		return this;
	}

	public String getOriginalCurrency() {
		return originalCurrency;
	}

	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ForeignExchange foreignExchange = (ForeignExchange) o;
		return Objects.equals(this.contractReference, foreignExchange.contractReference)
				&& Objects.equals(this.exchangeRate, foreignExchange.exchangeRate)
				&& Objects.equals(this.originalAmount, foreignExchange.originalAmount)
				&& Objects.equals(this.originalCurrency, foreignExchange.originalCurrency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contractReference, exchangeRate, originalAmount, originalCurrency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ForeignExchange {\n");

		sb.append("    contractReference: ").append(toIndentedString(contractReference)).append("\n");
		sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
		sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
		sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
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
