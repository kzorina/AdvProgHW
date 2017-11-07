package lab2.task3;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public interface ObjectConfigurator {
    public <T> void configure(T object, Class<T> type);
}
