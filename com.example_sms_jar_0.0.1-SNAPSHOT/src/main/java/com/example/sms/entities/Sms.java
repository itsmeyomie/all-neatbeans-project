/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author devyo
 */
@Entity
@Table(name = "sms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sms.findAll", query = "SELECT s FROM Sms s"),
    @NamedQuery(name = "Sms.findById", query = "SELECT s FROM Sms s WHERE s.id = :id"),
    @NamedQuery(name = "Sms.findByPhoneNumber", query = "SELECT s FROM Sms s WHERE s.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Sms.findByDeliveryReport", query = "SELECT s FROM Sms s WHERE s.deliveryReport = :deliveryReport"),
    @NamedQuery(name = "Sms.findByTimeStamp", query = "SELECT s FROM Sms s WHERE s.timeStamp = :timeStamp")})
public class Sms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phone_number")
    private long phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "notification")
    private String notification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delivery_report")
    private int deliveryReport;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    public Sms() {
    }

    public Sms(Integer id) {
        this.id = id;
    }

    public Sms(Integer id, long phoneNumber, String notification, int deliveryReport, Date timeStamp) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.notification = notification;
        this.deliveryReport = deliveryReport;
        this.timeStamp = timeStamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public int getDeliveryReport() {
        return deliveryReport;
    }

    public void setDeliveryReport(int deliveryReport) {
        this.deliveryReport = deliveryReport;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sms)) {
            return false;
        }
        Sms other = (Sms) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Sms{" + "id=" + id + ", phoneNumber=" + phoneNumber + ", notification=" + notification + ", deliveryReport=" + deliveryReport + ", timeStamp=" + timeStamp + '}';
    }

    
    
}
