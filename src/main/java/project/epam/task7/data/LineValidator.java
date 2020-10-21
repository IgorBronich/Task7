package project.epam.task7.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {
    private static final String REGEX = "(\\d+\\.(\\d+)\\s*){8}";
    public boolean validateLine(String line){

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
