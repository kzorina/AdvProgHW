package lab2.task2.http;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class SuccessHttpHandler implements HttpHandler {
    @Override
    public void handle(int code) {
        System.out.println("SUCCESS!!! Code is "+code);
    }
}
