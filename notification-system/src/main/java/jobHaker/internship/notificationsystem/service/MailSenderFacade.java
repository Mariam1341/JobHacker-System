package jobHacker.internship.notificationsystem.service;

import jobHacker.internship.notificationsystem.entity.Mail;

public interface MailSenderFacade {
    void sendMail(Mail mail);
    void retryMail(Mail mail);
}
