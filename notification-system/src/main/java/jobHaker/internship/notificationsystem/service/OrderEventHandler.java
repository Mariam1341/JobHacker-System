package jobHacker.internship.notificationsystem.service;

import jobHacker.internship.notificationsystem.model.OrderEventModel;

public interface OrderEventHandler {

    void handle(OrderEventModel orderEvent);
}
