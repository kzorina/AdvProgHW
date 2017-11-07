package lab2.task1;

/**
 * Created by zorka_000 on 11/7/2017.
 */
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "happy birthday " + mailInfo.getClient().getName();
    }
}
