package ru.ravvcheck.itmo.springLabs.exceptions;

public class ExitException extends RuntimeException{
    ExitException(String message){super(message);}
}
