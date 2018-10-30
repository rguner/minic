package com.mkyong.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
/*
 http://localhost:8080/RESTfulExample/rest/calisma/ramazan ile deneyebilirsin.

<modelDeneme>
<a>ramazan</a>
<b>bbbbbbbbbbbb</b>
</modelDeneme>
dönüyor.
*/


@Path("/calisma")
public class CalismaXmlService {
 
	@GET
	@Path("/{param}")
	//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_XML)
	public Response getMsg(@PathParam("param") String msg) {
 
		ModelDeneme modelDeneme = new ModelDeneme();
		modelDeneme.a=msg;
		modelDeneme.b="bbbbbbbbbbbb";
		
		return Response.status(200).entity(modelDeneme).build();
 
	}
 
}