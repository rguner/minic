package com.mkyong.rest;

import com.mkyong.Track;
import com.mkyong.ValidateRequest;
import com.mkyong.ValidateResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// http://localhost:8080/RESTfulJsonExample/rest/json/metallica/get ile denenebilir.
@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		// try {
		// Thread.currentThread().sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return track;

	}

	@GET
	@Path("/get/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON1() {

		Track track = new Track();
		track.setTitle("Ramazan");
		track.setSinger("Guner");

		// try {
		// Thread.currentThread().sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return track;

	}

	@GET
	@Path("/get/2")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON2() {

		Track track = new Track();
		track.setTitle("Ceyhan");
		track.setSinger("Guner");

		// try {
		// Thread.currentThread().sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return track;

	}

	// RestfulJsonClient ile denenebilir.
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

	@POST
	@Path("/post2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ValidateResponse createTrackInJSONReturnsString(ValidateRequest validateRequest) {

		String result = "ValidateRequest saved : " + validateRequest;
		ValidateResponse validateResponse = new ValidateResponse();
		validateResponse.setCode("OK");
		return validateResponse;

	}

}
