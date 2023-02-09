package com.java.bank.dto.creditAccount;

import lombok.Data;

@Data
public class SearchCreditAccountDto {
    private Integer page = 1;
    private Integer pageSize = 10;
    private Integer csn;
}
