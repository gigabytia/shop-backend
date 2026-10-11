package domain;

import java.util.UUID;

public class User {
    private final UUID id;
    private String username;

    public User(String username) {
        this.id = UUID.randomUUID();
        this.username = username;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
