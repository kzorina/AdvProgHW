package lab2.task2.http;

/**
 * Created by zorka_000 on 11/6/2017.
 */
import lombok.Getter;

@Getter
public enum HttpStatus {
    INFORMATIONAL(100,199,"Informational responses", new InformationalHttpHandler()),
    SUCCESS(200,299,"Succes", new SuccessHttpHandler()),
    REDIRECTION(300,399,"Redirection", new RedirectionHttpHandler()),
    CLIENT_ERRORS(400,499,"Client errors", new ClientErrHttpHandler()),
    SERVER_ERRORS(500,599,"Server errors", new ServerErrHttpHandler());
    private int min;
    private int max;
    private String description;
    private HttpHandler handler;


    HttpStatus(int min, int max, String description, HttpHandler handler){//dbCode, String russianDesc) {
        this.min = min;
        this.max = max;
        this.description = description;
        this.handler = handler;
    }
    public static HttpStatus getHttpStatus(int errorCode){
        for (HttpStatus i : values()){
            if (errorCode>=i.min && errorCode<=i.max){
                return i;
            }
        }
        throw new RuntimeException(errorCode+" is an unknown error code...");
    }



    @Override
    public String toString() {
        return "hi";

    }
}
