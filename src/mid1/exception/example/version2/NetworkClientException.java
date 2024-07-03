package mid1.exception.example.version2;

public class NetworkClientException extends Exception{

    String errorCode;
    public NetworkClientException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
