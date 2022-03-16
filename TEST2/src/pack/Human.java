/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

public abstract class Human {

    protected String name;
    protected String gender;
    protected String subject;

    protected String getName() {
        return name;
    }
    protected abstract void attendance();




     
 

    protected void setName(String name) {
        this.name = name;
    }

    protected String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
       
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    protected String getSubject() {
        return subject;
    }
}
