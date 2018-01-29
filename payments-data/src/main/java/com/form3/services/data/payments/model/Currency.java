package com.form3.services.data.payments.model;

/**
 * Gets or Sets Currency
 */
public enum Currency {
  
  USD("USD"),
  
  GBP("GBP"),
  
  EUR("EUR"),
  
  INR("INR");

  private String value;

  Currency(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Currency fromValue(String text) {
    for (Currency b : Currency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

