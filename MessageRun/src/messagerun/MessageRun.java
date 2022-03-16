/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagerun;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author devyo
 */
public class MessageRun {

    Person person;

    public static void main(String[] args) {

        Contact contact1 = new Contact();
        contact1.setEmail("thisguy@gmail.com");
        contact1.setPhoneNumber(0224);

        Person person1 = new Person();
        person1.setContact(contact1);
        person1.setName("this guy");

        Notification sm1 = new SmsMessage();
        sm1.setDate("24/5/2020 13:30 pm");
        sm1.setDeliveryReport(false);
        sm1.setMessage(" go home");

        Notification em1 = new EmailMessage();
        em1.setDate("24/5/2020 13:30 pm");
        em1.setDeliveryReport(false);
        em1.setMessage(" work hard ");

          //Stack<MessageSender> messageSenders1 = new Stack<>();
//        ArrayList<MessageSender> messageSenders = new ArrayList<>();
          Queue<MessageSender>messageSenders2=new LinkedList<>();

        MessageSender ss1 = new SmsSender();
        MessageSender es1 = new EmailSender();

        //notificacation into stuck
        // message into
        ss1.setNotification(sm1);
        es1.setNotification(em1);

        messageSenders2.add(ss1);
        messageSenders2.add(es1);

        sendMessages(messageSenders2, person1);

    }

    public static void sendMessages( Queue<MessageSender>messageSenders2, Person person) {

        while (!messageSenders2.isEmpty()) {

            messageSenders2.poll().sendMessage(person);

        }
    }
}
// TODO code application logic here
// create one person
// create an email notfication
// create an sms notfication
// send the notifications to the person
//ss1.sendMessage(person, sm1);
//es1.sendMessage(person, em1);

