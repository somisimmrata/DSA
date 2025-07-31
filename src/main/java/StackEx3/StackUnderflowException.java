package StackEx3;

public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException(String message){
        super(message);
    }
}
