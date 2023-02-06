package transport;

public class TransportTypeException extends RuntimeException{

    public TransportTypeException(){
    }

    public TransportTypeException (String message){
        super(message);
    }
}
