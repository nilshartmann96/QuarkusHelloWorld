package org.acme.getting.started;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "messages")
public class Message implements Serializable {

    private Long id;
    private String message;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
