package dev.litebank.dto.response;

import dev.litebank.models.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DepositResponse {
    private TransactionStatus transactionStatus;
    private BigDecimal amount;
    private String transactionId;
}