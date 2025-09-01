package dev.litebank.service;


import dev.litebank.dto.request.DepositRequest;
import dev.litebank.dto.response.DepositResponse;
import dev.litebank.models.PaymentMethod;
import dev.litebank.models.TransactionStatus;
import dev.litebank.dto.response.ViewAccountResponse;
import dev.litebank.services.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;


    @Test
    void testCanDeposit(){
        DepositRequest depositRequest = new DepositRequest();
        depositRequest.setPaymentMethod(PaymentMethod.CARD);
        depositRequest.setAccountNumber("0123456789");
        depositRequest.setAmount(new BigDecimal(10_000));
        DepositResponse depositResponse = accountService.deposit(depositRequest);
        assertNotNull(depositResponse);
        assertEquals(TransactionStatus.SUCCESS, depositResponse.getTransactionStatus());

    }

    @Test
    void testCanViewAccount(){
        ViewAccountResponse response =
                accountService.viewDetailsFor("0123456789");
        assertThat(response).isNotNull();
        assertThat(response.getBalance()).isEqualTo(new BigDecimal("370000.00").toString());
    }

}