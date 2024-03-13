import org.automation.java.AddTwoIntegers;
import org.automation.java.RegexUsage;

public class JavaProgramMain {

    public static void main(String[] args) {
        AddTwoIntegers addTwoIntegers = new AddTwoIntegers();
        addTwoIntegers.addTwoNumber();

        RegexUsage regexUsage = new RegexUsage();
        String str = "@@!%%testing1234&++Java";
        System.out.println(regexUsage.removeSpecialChar(str));
    }
}
