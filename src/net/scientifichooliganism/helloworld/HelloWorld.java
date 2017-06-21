package net.scientifichooliganism.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

/**
* This class represents a Hello World restful web service.
*/
@Path("/HelloWorld")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorld {
	private Gson gson;

	/**
	* Object default constructor used to instantiate HelloWorld.
	*/
	public HelloWorld() {
		gson = new Gson();
	}

	/**
	* This method is used to return a JSON object representing a string.
	*
	* @return a JSON String
	*/
	@GET
	public String getResponse() {
		return gson.toJson("Hello World!");
	}
}