package dev.litebank.services;

import dev.litebank.dto.request.CreateTransactionRequest;
import dev.litebank.dto.response.CreateTransactionResponse;
import dev.litebank.dto.response.TransactionResponse;
import dev.litebank.models.Transaction;
import dev.litebank.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public CreateTransactionResponse create(CreateTransactionRequest transactionRequest) {
        Transaction transaction = transactionRepository.save(createTransactionFrom(transactionRequest));
        return buildTransactionResponseFrom(transaction);
    }

    private CreateTransactionResponse buildTransactionResponseFrom(Transaction transaction) {
        return modelMapper.map(transaction, CreateTransactionResponse.class);
    }

    private Transaction createTransactionFrom(CreateTransactionRequest transactionRequest) {
        return modelMapper.map(transactionRequest, Transaction.class);
    }

    @Override
    public TransactionResponse getTransactionById(String id) {
        Transaction transaction = transactionRepository.findById(id).orElseThrow(()-> new RuntimeException("Transaction not found"));
        return modelMapper.map(transaction, TransactionResponse.class);
    }

    @Override
    public List<TransactionResponse> getTransactionsFor(String accountNumber) {
        return List.of();
    }
}