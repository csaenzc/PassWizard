package org.example;

import java.util.Objects;

public class Credential {
    private String name;
    private String password;
    private String service;

    Credential() {
        this.setName(name);
        this.setPassword(password);
        this.setService(service);
    }

    public void setName(String name) {
        if (!Objects.equals(name, "invalid")) {
            this.name = name;
        } else {
            System.out.println("Please enter a valid name");
        }
    }

    public void setPassword(String password) {
        if (!Objects.equals(password, "invalid")) {
            this.password = password;
        } else {
            System.out.println("Invalid password");
        }
    }

    public void setService(String service) {
        if (!Objects.equals(name, "invalid")) {
            this.service = service;
        } else {
            System.out.println("Invalid service");
        }
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getService() {
        return service;
    }
}
