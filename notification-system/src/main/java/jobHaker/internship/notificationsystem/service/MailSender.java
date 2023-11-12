package jobHacker.internship.notificationsystem.service;

import jobHacker.internship.notificationsystem.entity.Mail;

public interface MailSender {

    void sendMail(Mail mail);
}
