package lab2.task1;

/**
 * Created by zorka_000 on 11/7/2017.
 */
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailSender2 {

    private Map<Integer, Class<? extends MailGenerator>> map = new HashMap<>();
    @SneakyThrows
    public MailSender2() {
        Reflections scanner = new Reflections("lab2.task1");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        int counter = 1;
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                map.put(counter, aClass);
                counter++;
            }
        }
    }
    @SneakyThrows
    public void sendMail(MailInfo mailInfo) {

        Class<? extends MailGenerator> mailGeneratorClass = map.get(mailInfo.getMailCode());
        MailGenerator mailGenerator = mailGeneratorClass.newInstance();
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);


    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
