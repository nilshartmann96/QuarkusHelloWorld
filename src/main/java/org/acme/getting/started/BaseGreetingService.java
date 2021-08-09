package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import java.util.Collections;
import java.util.Map;

@ApplicationScoped
@Default
public class BaseGreetingService implements GreetingService {

    private final Map<String, String> message = Collections.singletonMap("message", "Hello World ohne Qualifier-Implementierung!");

    @Override
    public Map<String, String> getGreeting() {
        return message;
    }

}
