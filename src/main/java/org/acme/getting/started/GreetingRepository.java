package org.acme.getting.started;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class GreetingRepository implements PanacheRepositoryBase<Message, String> {

    public List<Message> getGreetingList() {
        return this.listAll();
    }

}
