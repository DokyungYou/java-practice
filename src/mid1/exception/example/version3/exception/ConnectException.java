package mid1.exception.example.version3.exception;

public class ConnectException extends NetworkClientException{

    private final String address;
    public ConnectException(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}