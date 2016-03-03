package com.example.restservicedemo.service;

import java.io.File;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("examples")
public class Example {

	@GET
	@Path("/test")
	@Produces("text/html")
	public String test() {
		return "REST Service is running";
	}

	@GET
	@Path("/class")
	@Produces("text/plain")
	public Response getMyClass() {
		File file = new File("myclasses/ServiceImpl.class");
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=\"ServiceImpl.class\"");
		return response.build();
	}

}
