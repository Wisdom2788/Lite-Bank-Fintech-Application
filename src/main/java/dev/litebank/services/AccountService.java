package dev.litebank.services;

import dev.litebank.dto.request.DepositRequest;
import dev.litebank.dto.request.CreateAccountRequest;
import dev.litebank.dto.response.CreateAccountResponse;
import dev.litebank.dto.response.DepositResponse;
import dev.litebank.dto.response.ViewAccountResponse;

import java.io.IOException;

public interface AccountService {

    DepositResponse deposit(DepositRequest depositRequest) throws IOException;

    ViewAccountResponse viewDetailsFor(String number);

    CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest);
}