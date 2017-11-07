package lab2.task3;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class RandomObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();
    @Override
    @SneakyThrows
    public <T> void configure(T object, Class<T> type) {

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {

            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int randomIntValue = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(object,randomIntValue);

            }
        }

    }
}
