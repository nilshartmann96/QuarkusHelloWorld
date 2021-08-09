package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.util.Collections;

@ApplicationScoped
public class GreetingService {

    public Response getGreeting() {
        return Response.ok(Collections.singletonMap("message", "Hello World!")).build();
    }

}