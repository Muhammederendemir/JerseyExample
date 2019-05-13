package com.service;

import model.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/jackson")
public class JacksonService {

    @GET
    @Path("/employee")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Muhammed");
        employee.setSurname("Demir");
        return employee;
    }

    @GET
    @Path("/employeeWrite")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEmployee1() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Muhammed");
        employee.setSurname("Demir");
        return employee.toString();
    }
}
