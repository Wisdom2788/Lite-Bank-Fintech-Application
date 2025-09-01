package dev.litebank.dto.request;


import dev.litebank.models.AccountType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountRequest {
    private String name;
    private String username;
    private String password;
    private AccountType accountType;
}