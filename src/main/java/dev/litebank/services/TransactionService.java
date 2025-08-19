package dev.litebank.services;

import dev.litebank.dto.request.CreateTransactionRequest;
import dev.litebank.dto.response.CreateTransactionResponse;
import dev.litebank.dto.response.TransactionResponse;

import java.util.List;

public interface TransactionService {
    CreateTransactionResponse create(CreateTransactionRequest transactionRequest);

    TransactionResponse getTransactionById(String id);

    List<TransactionResponse> getTransactionsFor(String accountNumber);
}