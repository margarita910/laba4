package Exceptions;

public class NotInitializedException extends IllegalArgumentException { //uncheked
    private String name;
    public NotInitializedException(String mistake){
        this.name = mistake;
        this.getException();
    }
    public String getException() {
        return name;

    }
}
