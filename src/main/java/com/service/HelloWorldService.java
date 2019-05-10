package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {//@Path param örneği

        String output = "Message : " + msg;

        return Response.status(200).entity(output).build();
    }
    //url ye alttaki örnek gibi yazılacaktır
    //http://localhost:8080/msg/message/naber

    @GET
    @Path("/person")
    public Response getName(@QueryParam("name") String name) {//@Query param örneği

        String output = "Name : " + name;

        return Response.status(200).entity(output).build();
    }
    //url ye alttaki örnek gibi yazılacaktır
    //http://localhost:8080/msg/message/person?name=Muhammed

    @GET
    @Path("/person1")
    public Response getNameSurname(@QueryParam("name") String name, @QueryParam("surname") String surname) {
        String output = "Name : " + name;
        output += "\n Surname : " + surname;

        return Response.status(200).entity(output).build();
    }
    //url ye alttaki örnek gibi yazılacaktır
    //http://localhost:8080/msg/message/person1?name=Muhammed&surname=Demir
    

}