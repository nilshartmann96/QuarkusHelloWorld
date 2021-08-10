package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/hello")
public class GreetingResource {

    @Inject
    @Informal
    GreetingService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response greet() {
        return Response.ok(this.service.getGreeting()).build();
    }

}
