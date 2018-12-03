package io.capsulo.presenterexample.view;

import android.support.annotation.NonNull;

/**
 * Data that will be displayed on screen
 * Todo: Use a Builder design pattern to create instance of the class
 */
public class DisplayableUser {

    private String firstname;
    private String lastname;

    public DisplayableUser(@NonNull String firstname, @NonNull  String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Return the firstname
     * @return // todo : How to write javadoc
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Return the lastname
     * @return // todo : How to write javadoc
     */
    public String getLastname() {
        return lastname;
    }
}
