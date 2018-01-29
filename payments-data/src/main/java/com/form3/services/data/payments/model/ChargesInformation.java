package com.form3.services.data.payments.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChargesInformation {
	private String bearerCode = null;

	private List<Charge> senderCharges = null;

	private Double receiverChargesAmount = null;

	private Currency receiverChargesCurrency = null;

	public ChargesInformation bearerCode(String bearerCode) {
		this.bearerCode = bearerCode;
		return this;
	}

	public String getBearerCode() {
		return bearerCode;
	}

	public void setBearerCode(String bearerCode) {
		this.bearerCode = bearerCode;
	}

	public ChargesInformation senderCharges(List<Charge> senderCharges) {
		this.senderCharges = senderCharges;
		return this;
	}

	public ChargesInformation addSenderChargesItem(Charge senderChargesItem) {
		if (this.senderCharges == null) {
			this.senderCharges = new ArrayList<Charge>();
		}
		this.senderCharges.add(senderChargesItem);
		return this;
	}

	public List<Charge> getSenderCharges() {
		return senderCharges;
	}

	public void setSenderCharges(List<Charge> senderCharges) {
		this.senderCharges = senderCharges;
	}

	public ChargesInformation receiverChargesAmount(Double receiverChargesAmount) {
		this.receiverChargesAmount = receiverChargesAmount;
		return this;
	}

	public Double getReceiverChargesAmount() {
		return receiverChargesAmount;
	}

	public void setReceiverChargesAmount(Double receiverChargesAmount) {
		this.receiverChargesAmount = receiverChargesAmount;
	}

	public ChargesInformation receiverChargesCurrency(Currency receiverChargesCurrency) {
		this.receiverChargesCurrency = receiverChargesCurrency;
		return this;
	}

	public Currency getReceiverChargesCurrency() {
		return receiverChargesCurrency;
	}

	public void setReceiverChargesCurrency(Currency receiverChargesCurrency) {
		this.receiverChargesCurrency = receiverChargesCurrency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChargesInformation chargesInformation = (ChargesInformation) o;
		return Objects.equals(this.bearerCode, chargesInformation.bearerCode)
				&& Objects.equals(this.senderCharges, chargesInformation.senderCharges)
				&& Objects.equals(this.receiverChargesAmount, chargesInformation.receiverChargesAmount)
				&& Objects.equals(this.receiverChargesCurrency, chargesInformation.receiverChargesCurrency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bearerCode, senderCharges, receiverChargesAmount, receiverChargesCurrency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargesInformation {\n");
		sb.append("    bearerCode: ").append(toIndentedString(bearerCode)).append("\n");
		sb.append("    senderCharges: ").append(toIndentedString(senderCharges)).append("\n");
		sb.append("    receiverChargesAmount: ").append(toIndentedString(receiverChargesAmount)).append("\n");
		sb.append("    receiverChargesCurrency: ").append(toIndentedString(receiverChargesCurrency)).append("\n");
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
