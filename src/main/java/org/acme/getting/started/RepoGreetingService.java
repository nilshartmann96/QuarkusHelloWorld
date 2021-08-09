package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.Map;

@ApplicationScoped
@Informal
public class RepoGreetingService implements GreetingService {

    private final Map<String, String> message = Collections.singletonMap("message", "Hello World mit Qualifier-Implementierung!");

    @Override
    public Map<String, String> getGreeting() {
        return message;
    }

}
