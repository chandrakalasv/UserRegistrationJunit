package com.bl.java;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean userValidFirstName(String userFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", userFirstName);
    }
    public boolean userValidLastName(String userLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", userLastName);
    }

}