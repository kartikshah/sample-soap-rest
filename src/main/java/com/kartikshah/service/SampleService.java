package com.kartikshah.service;

import com.kartikshah.dto.User;
import com.kartikshah.dto.UserCredential;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: kartik
 * Date: 5/23/13
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */

@Path("/UserRestService")
@WebService
public interface SampleService
{

    @Path("/login")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod(operationName = "login")
    public @WebResult(name = "user") User login(
        @WebParam(name = "userCredential") @XmlElement(required = true) UserCredential userCredentials
    );

    @Path("/loginWithRole")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod(operationName = "loginWithRole")
    public @WebResult(name = "user") User loginWithRole(
        @WebParam(name = "userCredential") @XmlElement(required = true) UserCredential userCredentials,
        @WebParam(name = "role") @XmlElement(required = true) String role
    );

    @POST
    @Path("echo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @WebMethod(operationName = "echo")
    public @WebResult(name = "message") String echo(
        @WebParam(name = "message") String message
    );

}
