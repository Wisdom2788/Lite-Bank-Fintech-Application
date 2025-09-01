package dev.litebank.dto.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailNotificationRequest {
    private String recipient;
    private String subject;
    private String mailBody;

}