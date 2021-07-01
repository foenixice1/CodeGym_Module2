package ValidateSDT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  ValidateSDT{
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NUMBER = "^[(]+\\d{2}+[)]+[-]+[(][0]+\\d{9}+[)]$";

    public ValidateSDT() {
        pattern = Pattern.compile(NUMBER);
    }
    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static class ValidateSDTTest {
        private static ValidateSDT validateSDT;
        public static final String[] validRegular = new String[] {"(84)-(0978489699)", "(84)-(0978489111)", "(84)-(0978489238)"};
        public static final String[] invalidRegular = new String[] {"(e)-(0978489699)", "(1)-(0978489111)", "(84)-(978489238)"};

        public static void main(String[] args) {
            validateSDT = new ValidateSDT();
            for (String re : validRegular) {
                boolean isvalid = validateSDT.validate(re);
                System.out.println(" Class is " + re +" is valid : "+ isvalid);
            }
            for (String re : invalidRegular) {
                boolean isvalid = validateSDT.validate(re);
                System.out.println("Class is " + re +" is valid: "+ isvalid);
            }
        }
    }
}