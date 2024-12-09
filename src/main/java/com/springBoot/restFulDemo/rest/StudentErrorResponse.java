package com.springBoot.restFulDemo.rest;


//So, actually this is like a placeholder for the exception handlers JSONS we are going to use, like, since all the objects can be converted to JSON using Jackson, this is how we are going to handle exceptions.
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public StudentErrorResponse() {
    }
}
