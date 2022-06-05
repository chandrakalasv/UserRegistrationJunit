package com.bl.java;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean userValidName(String userFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", userFirstName);
    }

}