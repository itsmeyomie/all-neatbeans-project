/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagerun;

/**
 *
 * @author devyo
 */
public interface MessageSender {

    public void sendMessage(Person person);

    public void setNotification(Notification sm1);

   public Notification getNotification();

   

   
}
