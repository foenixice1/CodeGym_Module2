package ValidateTenLop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS = "^[CAP][0-9]+[GHIKLM]$";

    public RegularExpression() {
        pattern = Pattern.compile(CLASS);
    }
    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static class RegularExampleTest {
        private static RegularExpression regularExpression;
        public static final String[] validRegular = new String[] {"C3318G","C1318H","C1118I","C0319M"};
        public static final String[] invalidRegular = new String[] {"Cwe8Q","C138B","C111w8C","C0319_W"};

        public static void main(String[] args) {
            regularExpression = new RegularExpression();
            for (String re : validRegular) {
                boolean isvalid = regularExpression.validate(re);
                System.out.println(" Class is " + re +" is valid : "+ isvalid);
            }
            for (String re : invalidRegular) {
                boolean isvalid = regularExpression.validate(re);
                System.out.println("Class is " + re +" is valid: "+ isvalid);
            }
        }
    }
}
