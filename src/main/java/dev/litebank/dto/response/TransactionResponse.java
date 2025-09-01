package dev.litebank.dto.response;


import dev.litebank.models.TransactionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TransactionResponse {
    private String id;
    private String amount;
    private TransactionType transactionType;

}