package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class StringMethods implements TextProcessor {

    private final static Logger LOGGER = Logger.getLogger(StringMethods.class);

    @Override
    public String removeSymbols(String string) {
        String buffer = string.replaceAll(removeAllNonWordSymbols, empty);
        LOGGER.info("Remove all non-word symbols from the string");
        String result = buffer.replaceAll(insertSpaces, spaces);
        LOGGER.info("Separate all symbols by spaces");
        return result.replaceAll(trimSpaces, empty);
    }

    @Override
    public String replaceLetter(String string) {
        String[] words = string.split(delimiter);
        LOGGER.info("Separate string to words");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder buffer = new StringBuilder(word);
            if (word.length() >= replacePosition) {
                buffer.setCharAt(replacePosition - 1, substituteCH);
            }
            result.append(buffer).append(delimiter);
        }
        // deleting last space
        result.deleteCharAt(result.length() - 1);
        return new String(result);
    }
}
