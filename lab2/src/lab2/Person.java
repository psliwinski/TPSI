/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Student
 */
public class Person implements EmailRecipient {

    /**
     * @param args the command line arguments
     */
    private String firstName;
    private String lastName;
    private String emailAddress;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public Person(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress=emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

}
