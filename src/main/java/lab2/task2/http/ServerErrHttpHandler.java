package lab2.task2.http;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class ServerErrHttpHandler implements HttpHandler {

    @Override
    public void handle(int code) {
        System.out.println("We got Server Error, please contact to server people +380636663366. Code is "+code);
    }
}
