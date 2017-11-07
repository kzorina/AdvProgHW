package lab2.task2.http;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by zorka_000 on 11/6/2017.
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        DataFactory dataFactory = new DataFactory();

        while (true) {
            int errorCode = dataFactory.getNumberBetween(100, 600);
            HttpStatus.getHttpStatus(errorCode).getHandler().handle(errorCode);
            Thread.sleep(1000);
        }
    }
}
