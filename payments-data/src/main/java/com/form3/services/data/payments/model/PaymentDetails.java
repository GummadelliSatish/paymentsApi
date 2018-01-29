package com.form3.services.data.payments.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaymentDetails {
	
	private Party beneficiaryParty = null;

	private Party debtorParty = null;

	private Party sponsorParty = null;

	private Double amount = null;

	private Currency currency = null;

	private String endToEndReference = null;

	private String numericReference = null;

	private String paymentId = null;

	private String paymentPurpose = null;

	private String paymentScheme = null;

	private String paymentType = null;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate processingDate = null;

	private String reference = null;

	private String schemePaymentSubType = null;

	private String schemePaymentType = null;

	private ChargesInformation chargesInformation = null;

	private ForeignExchange fx = null;

	public PaymentDetails beneficiaryParty(Party beneficiaryParty) {
		this.beneficiaryParty = beneficiaryParty;
		return this;
	}

	public Party getBeneficiaryParty() {
		return beneficiaryParty;
	}

	public void setBeneficiaryParty(Party beneficiaryParty) {
		this.beneficiaryParty = beneficiaryParty;
	}

	public PaymentDetails debtorParty(Party debtorParty) {
		this.debtorParty = debtorParty;
		return this;
	}

	public Party getDebtorParty() {
		return debtorParty;
	}

	public void setDebtorParty(Party debtorParty) {
		this.debtorParty = debtorParty;
	}

	public PaymentDetails sponsorParty(Party sponsorParty) {
		this.sponsorParty = sponsorParty;
		return this;
	}

	public Party getSponsorParty() {
		return sponsorParty;
	}

	public void setSponsorParty(Party sponsorParty) {
		this.sponsorParty = sponsorParty;
	}

	public PaymentDetails amount(Double amount) {
		this.amount = amount;
		return this;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentDetails currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public PaymentDetails endToEndReference(String endToEndReference) {
		this.endToEndReference = endToEndReference;
		return this;
	}

	public String getEndToEndReference() {
		return endToEndReference;
	}

	public void setEndToEndReference(String endToEndReference) {
		this.endToEndReference = endToEndReference;
	}

	public PaymentDetails numericReference(String numericReference) {
		this.numericReference = numericReference;
		return this;
	}

	public String getNumericReference() {
		return numericReference;
	}

	public void setNumericReference(String numericReference) {
		this.numericReference = numericReference;
	}

	public PaymentDetails paymentId(String paymentId) {
		this.paymentId = paymentId;
		return this;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public PaymentDetails paymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
		return this;
	}

	public String getPaymentPurpose() {
		return paymentPurpose;
	}

	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}

	public PaymentDetails paymentScheme(String paymentScheme) {
		this.paymentScheme = paymentScheme;
		return this;
	}

	public String getPaymentScheme() {
		return paymentScheme;
	}

	public void setPaymentScheme(String paymentScheme) {
		this.paymentScheme = paymentScheme;
	}

	public PaymentDetails paymentType(String paymentType) {
		this.paymentType = paymentType;
		return this;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public PaymentDetails processingDate(LocalDate processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	public LocalDate getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(LocalDate processingDate) {
		this.processingDate = processingDate;
	}

	public PaymentDetails reference(String reference) {
		this.reference = reference;
		return this;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public PaymentDetails schemePaymentSubType(String schemePaymentSubType) {
		this.schemePaymentSubType = schemePaymentSubType;
		return this;
	}

	public String getSchemePaymentSubType() {
		return schemePaymentSubType;
	}

	public void setSchemePaymentSubType(String schemePaymentSubType) {
		this.schemePaymentSubType = schemePaymentSubType;
	}

	public PaymentDetails schemePaymentType(String schemePaymentType) {
		this.schemePaymentType = schemePaymentType;
		return this;
	}

	public String getSchemePaymentType() {
		return schemePaymentType;
	}

	public void setSchemePaymentType(String schemePaymentType) {
		this.schemePaymentType = schemePaymentType;
	}

	public PaymentDetails chargesInformation(ChargesInformation chargesInformation) {
		this.chargesInformation = chargesInformation;
		return this;
	}

	public ChargesInformation getChargesInformation() {
		return chargesInformation;
	}

	public void setChargesInformation(ChargesInformation chargesInformation) {
		this.chargesInformation = chargesInformation;
	}

	public PaymentDetails fx(ForeignExchange fx) {
		this.fx = fx;
		return this;
	}

	public ForeignExchange getFx() {
		return fx;
	}

	public void setFx(ForeignExchange fx) {
		this.fx = fx;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentDetails paymentDetails = (PaymentDetails) o;
		return Objects.equals(this.beneficiaryParty, paymentDetails.beneficiaryParty)
				&& Objects.equals(this.debtorParty, paymentDetails.debtorParty)
				&& Objects.equals(this.sponsorParty, paymentDetails.sponsorParty)
				&& Objects.equals(this.amount, paymentDetails.amount)
				&& Objects.equals(this.currency, paymentDetails.currency)
				&& Objects.equals(this.endToEndReference, paymentDetails.endToEndReference)
				&& Objects.equals(this.numericReference, paymentDetails.numericReference)
				&& Objects.equals(this.paymentId, paymentDetails.paymentId)
				&& Objects.equals(this.paymentPurpose, paymentDetails.paymentPurpose)
				&& Objects.equals(this.paymentScheme, paymentDetails.paymentScheme)
				&& Objects.equals(this.paymentType, paymentDetails.paymentType)
				&& Objects.equals(this.processingDate, paymentDetails.processingDate)
				&& Objects.equals(this.reference, paymentDetails.reference)
				&& Objects.equals(this.schemePaymentSubType, paymentDetails.schemePaymentSubType)
				&& Objects.equals(this.schemePaymentType, paymentDetails.schemePaymentType)
				&& Objects.equals(this.chargesInformation, paymentDetails.chargesInformation)
				&& Objects.equals(this.fx, paymentDetails.fx);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beneficiaryParty, debtorParty, sponsorParty, amount, currency, endToEndReference,
				numericReference, paymentId, paymentPurpose, paymentScheme, paymentType, processingDate, reference,
				schemePaymentSubType, schemePaymentType, chargesInformation, fx);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentDetails {\n");

		sb.append("    beneficiaryParty: ").append(toIndentedString(beneficiaryParty)).append("\n");
		sb.append("    debtorParty: ").append(toIndentedString(debtorParty)).append("\n");
		sb.append("    sponsorParty: ").append(toIndentedString(sponsorParty)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    endToEndReference: ").append(toIndentedString(endToEndReference)).append("\n");
		sb.append("    numericReference: ").append(toIndentedString(numericReference)).append("\n");
		sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
		sb.append("    paymentPurpose: ").append(toIndentedString(paymentPurpose)).append("\n");
		sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
		sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
		sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
		sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("    schemePaymentSubType: ").append(toIndentedString(schemePaymentSubType)).append("\n");
		sb.append("    schemePaymentType: ").append(toIndentedString(schemePaymentType)).append("\n");
		sb.append("    chargesInformation: ").append(toIndentedString(chargesInformation)).append("\n");
		sb.append("    fx: ").append(toIndentedString(fx)).append("\n");
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
