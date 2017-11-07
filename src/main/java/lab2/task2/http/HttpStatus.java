package lab2.task2.http;

/**
 * Created by zorka_000 on 11/6/2017.
 */
import lombok.Getter;

@Getter
public enum HttpStatus {
    INFORMATIONAL(100,199),
    SUCCESS(200,299),
    REDIRECTION(300,399),
    CLIENT_ERRORS(400,499),
    SERVER_ERRORS(500,599);
    private int min;
    private int max;


    HttpStatus(int min, int max){//dbCode, String russianDesc) {
        this.min = min;
        this.max = max;
    }



    @Override
    public String toString() {
        return "hi";
        
    }
}
