package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Map;

@Path("/api/hello")
public class GreetingResource {

    private final Map<String, String> message = Collections.singletonMap("message", "Hello World");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloJSON() {
        return Response.ok(message).build();
    }
}
