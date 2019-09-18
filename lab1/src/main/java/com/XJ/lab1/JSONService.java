package com.XJ.lab1;

//import java.util.Arrays;
import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.json.JsonUtil;
import org.kopitubruk.util.json.JSONUtil;

@Path("persons")

public class JSONService {

	PersonRepository repo = new PersonRepository();

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Person> getPersons() {
		System.out.println("Server got GET request.");
//		String out = "Server got GET request. Info return:";
//		out += repo.getPersons();
//		String jsonOut = JSONUtil.toJSON(out);
		return repo.getPersons();
	}


	@GET
	@Path("person/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Person getPerson(@PathParam("id") int id) {
		System.out.println("Server got GET request: client requested person info with id " + id + ".");
		return repo.getPerson(id);
	}

	@POST
	@Path("person")
	@Consumes({ MediaType.APPLICATION_JSON })
	public List<Person> getRequest(Person p) {
		System.out.println("Server got POST request:");
		System.out.println(p);
		repo.create(p);
		String out = "Server got POST request:";
//		out += p;
//		String jsonOut = JSONUtil.toJSON(out);
		return repo.getPersons();
	}
}
