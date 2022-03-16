/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagerun;

public class SmsSender implements MessageSender {

    Notification notification;

    @Override
    public void sendMessage(Person person) {
        System.out.println("sending sms to " + person.getName() + " message is " + notification.getMessage());
    }

    @Override
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public Notification getNotification() {
        return notification;
    }

}
