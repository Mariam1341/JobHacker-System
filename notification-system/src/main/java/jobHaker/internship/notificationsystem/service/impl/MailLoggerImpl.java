package jobHacker.internship.notificationsystem.service.impl;

import jobHacker.internship.notificationsystem.entity.Mail;
import jobHacker.internship.notificationsystem.entity.MailStatus;
import jobHacker.internship.notificationsystem.repository.MailRepo;
import jobHacker.internship.notificationsystem.service.MailLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MailLoggerImpl implements MailLogger {
    private final MailRepo mailRepo;
    @Override
    public Mail log(Mail mail) {

       return mailRepo.save(mail);

    }

    @Override
    public void changeState(String id, MailStatus newStatus)
    {
        //TODO : handle notFoundCase ???
      Mail mail =  mailRepo.findById(id).get();
      mail.setStatus(newStatus);
      mailRepo.save(mail);


    }
}
