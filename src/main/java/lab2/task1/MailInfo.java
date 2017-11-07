package lab2.task1;

/**
 * Created by zorka_000 on 11/7/2017.
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private int mailCode;


    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }
}
