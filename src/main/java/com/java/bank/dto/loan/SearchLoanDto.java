package com.java.bank.dto.loan;

import lombok.Data;

@Data
public class SearchLoanDto {
    private Integer page = 1;
    private Integer pageSize = 10;
    private Integer csn;
}
