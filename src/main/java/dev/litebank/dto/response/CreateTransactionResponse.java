package dev.litebank.dto.response;


import dev.litebank.dto.TransactionType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTransactionResponse {
    private String Id;
    private TransactionType transactionType;
    private String amount;

}
