package com.epam.task.second.logic;

public class StringMethods implements TextProcessor {
    private final String removeAllNonWordSymbols = "[\\d+\\W ]";
    private final String insertSpaces = ".(?=.)";
    private final String spaces = "$0 ";
    private final int replacePosition = 5;
    private final String delimiter = " ";
    private final char substitute = '_';

    @Override
    public String removeSymbols(String string) {
        String buffer = string.replaceAll(removeAllNonWordSymbols, "");
        String result = buffer.replaceAll(insertSpaces, spaces);
        return result;
    }

    @Override
    public String replaceLetter(String string) {
        String[] words = string.split(delimiter);
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder buffer = new StringBuilder(word);
            if (word.length() >= replacePosition) {
                buffer.setCharAt(replacePosition - 1, substitute);
            }
            result.append(buffer).append(delimiter);
        }
        // deleting last space
        result.deleteCharAt(result.length() - 1);

        return new String(result);
    }
}
