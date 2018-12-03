package io.capsulo.presenterexample.model;

public class UserModel {

    private String firstName;
    private String lastName;

    public UserModel() {
        // Set the value by default
        this.firstName = "John";
        this.lastName = "Doe";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
