package com.tutorial.calcengine;

public class InvalidStatementException extends Exception{


    public InvalidStatementException(String reason, String statement) {

        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable casuse) {

        super(reason + ": " + statement, casuse);
    }

}
