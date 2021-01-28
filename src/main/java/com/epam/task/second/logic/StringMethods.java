package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class StringMethods implements TextProcessor {

    private final static Logger LOGGER = Logger.getLogger(StringMethods.class);

    private final String removeAllNonWordSymbols = "[\\d+\\W ]";
    private final String insertSpaces = ".(?=.)";
    private final String spaces = "$0 ";

    @Override
    public String removeSymbols(String string) {
        String buffer = string.replaceAll(removeAllNonWordSymbols, "");
        LOGGER.info("Remove all non-word symbols from the string");
        String result = buffer.replaceAll(insertSpaces, spaces);
        LOGGER.info("Separate all symbols by spaces");
        return result;
    }

    @Override
    public String replaceLetter(String string) {
        String[] words = string.split(delimiter);
        LOGGER.info("Separate string to words");
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
