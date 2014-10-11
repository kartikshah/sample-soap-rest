package com.kartikshah.service;
import javax.jws.WebService;

import com.kartikshah.dto.User;
import com.kartikshah.dto.UserCredential;

@WebService(endpointInterface = "com.kartikshah.service.SampleService")
public class SampleServiceImpl implements SampleService
{
    public User login(UserCredential userCredential)
    {
        System.out.println("User Credentials:" + userCredential.getUsername());
        return new User();
    }

    public User loginWithRole(UserCredential userCredential, String role)
    {
        System.out.println("Login with Role");
        return new User();
    }
    public String echo(String message) {
        return message;
    }
}