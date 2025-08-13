package dev.litebank.service;

import dev.litebank.dto.request.DepositRequest;
import dev.litebank.dto.response.DepositResponse;
import dev.litebank.dto.PaymentMethod;
import dev.litebank.dto.TransactionStatus;
import dev.litebank.services.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    void testCanDeposit() {
        DepositRequest depositRequest = new DepositRequest();
        depositRequest.setPaymentMethod(PaymentMethod.CARD);
        depositRequest.setAccountNumber("0123456789");
        depositRequest.setAmount(new BigDecimal(10_000));
        DepositResponse depositResponse = accountService.deposit(depositRequest);
        assertNotNull(depositResponse);
        assertEquals(TransactionStatus.SUCCESS, depositResponse.getTransactionStatus());

    }
}
