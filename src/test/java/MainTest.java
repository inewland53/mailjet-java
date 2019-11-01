import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.junit.Test;

public class MainTest
{
    @Test
    public void Main() throws MailjetSocketTimeoutException, MailjetException {
        new Main().sendEmail();
    }
}
