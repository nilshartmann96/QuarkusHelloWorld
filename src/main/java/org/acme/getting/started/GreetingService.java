package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.util.Map;

@ApplicationScoped
public class GreetingService {

    public Response helloJSON(Map<String, String> message) {
        return Response.ok(message).build();
    }

}