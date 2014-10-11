package com.kartikshah.dto;

import org.springframework.beans.factory.annotation.Required;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created with IntelliJ IDEA.
 * User: kartik
 * Date: 5/23/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement (name = "userCredential", namespace="com.kartikshah.dto")
public class UserCredential {

    private String username;

    private String password;

    public UserCredential(String usernamePassword){

    }

    public UserCredential(){

    }

    public String getUsername()
    {
        return "Kartik Shah";
    }

    public String getPassword() {
        return "static password";
    }

    @XmlElement(required = true)
    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement(required = true)
    public void setPassword(String password) {
        this.password = password;
    }

}
