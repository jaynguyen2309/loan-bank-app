package com.java.bank.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TransactionType {
    PAY("Pay"),
    ADJ("Adjust"),
    REF("Refund");
    private final String name;
}
