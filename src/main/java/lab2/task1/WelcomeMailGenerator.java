package lab2.task1;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        String greeting = "hi";
        if (mailInfo.getClient().getAge() > 50) {
            greeting = "Hello ";
        }

        return "<html> " + greeting + " " + mailInfo.getClient().getName() + " welcome to our Company";
    }
}
