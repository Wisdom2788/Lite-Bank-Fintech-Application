package dev.litebank.services;

import dev.litebank.dto.request.DepositRequest;
import dev.litebank.dto.response.DepositResponse;
import dev.litebank.dto.response.ViewAccountResponse;

public interface AccountService {

    DepositResponse deposit(DepositRequest depositRequest);

    ViewAccountResponse viewDetailsFor(String number);
}