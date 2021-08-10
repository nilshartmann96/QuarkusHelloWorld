package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@Informal
public class RepoGreetingService implements GreetingService {

    @Inject
    GreetingRepository greetingRepository;

    @Override
    public List<Message> getGreeting() {
        return greetingRepository.getGreetingList();
    }

}
