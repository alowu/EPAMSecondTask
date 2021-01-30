package com.epam.task.second.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethods implements TextProcessor{

    @Override
    public String removeSymbols(String string) {
        // remove digits & symbols
        Pattern pattern = Pattern.compile(removeAllNonWordSymbols);
        Matcher matcher = pattern.matcher(string);
        String withoutSymbols = matcher.replaceAll(empty);

        // insert spaces between letters
        pattern = Pattern.compile(insertSpaces);
        matcher = pattern.matcher(withoutSymbols);
        String withSpaces = matcher.replaceAll(spaces);

        // trim last space
        pattern = Pattern.compile(trimSpaces);
        matcher = pattern.matcher(withSpaces);
        String result = matcher.replaceAll(empty);

        return result;
    }

    @Override
    public String replaceLetter(String string) {
        Pattern pattern = Pattern.compile(replaceKth);
        Matcher matcher = pattern.matcher(string);
        String result = matcher.replaceAll(substituteST);
        return result;
    }
}
