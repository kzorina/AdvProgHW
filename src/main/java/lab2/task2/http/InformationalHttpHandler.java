package lab2.task2.http;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class InformationalHttpHandler implements HttpHandler {
    @Override
    public void handle(int code) {
        System.out.println("Request is received and understood. Code is "+code);
    }
}
