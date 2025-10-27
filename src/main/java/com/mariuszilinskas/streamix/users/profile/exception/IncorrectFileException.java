package com.mariuszilinskas.streamix.users.profile.exception;

public class IncorrectFileException extends RuntimeException {

    public IncorrectFileException(String extension) {
        super("Incorrect file extension: " + extension);
    }

}
