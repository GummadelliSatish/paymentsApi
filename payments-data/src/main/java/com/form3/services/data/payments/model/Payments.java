package com.form3.services.data.payments.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Payments {
	@Id
	private String id = null;

	private String type = null;

	private String version = null;

	private String organisationId = null;

	private PaymentDetails attributes = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}

	public PaymentDetails getAttributes() {
		return attributes;
	}

	public void setAttributes(PaymentDetails attributes) {
		this.attributes = attributes;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Payments payments = (Payments) o;
		return Objects.equals(this.id, payments.id) && Objects.equals(this.type, payments.type)
				&& Objects.equals(this.version, payments.version)
				&& Objects.equals(this.organisationId, payments.organisationId)
				&& Objects.equals(this.attributes, payments.attributes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, version, organisationId, attributes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Payments {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
