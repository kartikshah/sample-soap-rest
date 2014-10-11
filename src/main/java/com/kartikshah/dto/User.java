package com.kartikshah.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.ws.BindingType;

/**
 * Created with IntelliJ IDEA.
 * User: kartik
 * Date: 5/23/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name =  "user", namespace="com.kartikshah.dto")

public class User {
    private String firstName;
    private String lastName;
    private String address;

    public User(){
        this.firstName = "Test";
        this.lastName = "User";
        this.address = "Test Address";
        UserCredential userCredential = new UserCredential("kartik,password");
        userCredential.setUsername("testuser");
        userCredential.setPassword("testpassword");
        this.setUserCredential(userCredential);
    }

    @XmlElement(required = true)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(required = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "userCredentials")
    public UserCredential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(UserCredential userCredential) {
        this.userCredential = userCredential;
    }

    private UserCredential userCredential;

}
