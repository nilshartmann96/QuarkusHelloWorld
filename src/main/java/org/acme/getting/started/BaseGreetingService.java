package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.Map;

@ApplicationScoped
public class BaseGreetingService implements GreetingService {

    private final Map<String, String> message = Collections.singletonMap("message", "Hello World!");

    public Map<String, String> getGreeting() {
        return message;
    }

}
