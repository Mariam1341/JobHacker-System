package jobHacker.internship.notificationsystem.service;

import jobHacker.internship.notificationsystem.entity.Mail;
import jobHacker.internship.notificationsystem.entity.MailStatus;

public interface MailLogger {

    Mail log(Mail email);
    void changeState(String id, MailStatus newStatus);
}
