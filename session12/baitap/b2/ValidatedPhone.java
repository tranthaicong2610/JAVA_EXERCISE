package session12.baitap.b2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatedPhone {
    private static Pattern pattern ;
    private Matcher matcher;
    private static final String PHONE = "^[(]{1}[0-9]{2}[)]{1}[-]{1}[(]{1}[0-9]{10}[)]{1}$";
    public ValidatedPhone() {
        pattern = Pattern.compile(PHONE);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
