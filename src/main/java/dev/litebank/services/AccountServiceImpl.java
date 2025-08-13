package dev.litebank.services;

import dev.litebank.dto.request.DepositRequest;
import dev.litebank.dto.response.DepositResponse;
import dev.litebank.exception.AccountNotFoundException;
import dev.litebank.models.Account;
import dev.litebank.repository.AccountRepository;
import dev.litebank.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    @Override
    public DepositResponse deposit(DepositRequest depositRequest) {
        Account foundAccount = accountRepository.findByAccountNumber(depositRequest.getAccountNumber())
                .orElseThrow(()->new AccountNotFoundException("account not found"));
        //TODO: create transaction record
        return null;
    }
}