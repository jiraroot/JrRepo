package com.neusoft.demo.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jobs")
@Produces(MediaType.APPLICATION_JSON)
public class SimulationResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addJob() {
		
		Map<String, Object> results = new HashMap<String, Object>();
		results.put("resp_json_data", "mock-up POST Successful!");
		
		StringWriter writer = new StringWriter();
		JsonDataWriter jsonWriter = new JsonDataWriter();
		
		try {
			
			jsonWriter.writeOne(results, writer);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String str = writer.toString();
		
		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).entity(str).build();
		
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJob() {
		
		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).build();
	}
	
}
