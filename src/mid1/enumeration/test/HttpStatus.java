package mid1.enumeration.test;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error")
    ;

    private final int code;
    private final String message;

    HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

    public static HttpStatus getByCode(int code){
        for(HttpStatus status : HttpStatus.values()){
//            if(code >= 200 && code < 300){
//                return HttpStatus.OK;
//            }

            if(status.getCode() == code){
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        return (code == 200);
    }

    public void printStatus(){
        System.out.println("HTTP CODE: " + code);
        System.out.println(code + " " + message);
        System.out.println("isSuccess: " + isSuccess());
    }
}
