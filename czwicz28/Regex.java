package czwicz28;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String input ="A.B.C.D.";
        String regex = "[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.";
        System.out.println(Pattern.matches(regex, input));
    }


}

