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
public abstract class Notification {

    String date;
    boolean deliveryReport;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getDeliveryReport() {
        return deliveryReport;
    }

    public void setDeliveryReport(boolean deliveryReport) {
        this.deliveryReport = deliveryReport;
    }

}
