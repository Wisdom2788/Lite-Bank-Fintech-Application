package dev.litebank.services;

import dev.litebank.dto.request.EmailNotificationRequest;
import dev.litebank.dto.response.EmailNotificationResponse;

import java.io.IOException;

public interface EmailNotificationService {
    EmailNotificationResponse notifyBy(EmailNotificationRequest notificationRequest) throws IOException;

}