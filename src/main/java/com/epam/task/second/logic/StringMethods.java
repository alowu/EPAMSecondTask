package com.epam.task.second.logic;

public class StringMethods implements TextProcessor {
    private final String removeAllNonWordSymbols = "[\\d+\\W ]";
    private final String insertSpaces = ".(?=.)";
    private final String spaces = "$0 ";

    @Override
    public String removeSymbols(String string) {
        String buffer = string.replaceAll(removeAllNonWordSymbols, "");
        String result = buffer.replaceAll(insertSpaces, spaces);
        return result;
    }

    @Override
    public String replaceLetter(String string) {
        return null;
    }
}
