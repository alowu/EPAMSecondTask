package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class CharMethods implements TextProcessor {

    private final static Logger LOGGER = Logger.getLogger(StringMethods.class);

    protected int getSize(char[] str) {
        int size = 0;
        for (int i = 0; str[i] != '\0'; ++i) {
            ++size;
        }
        return size;
    }

    protected char[] resize(int size) {
        int newSize = size * 2 - 1;
        return new char[newSize];
    }

    protected char[] insertSpaces(char[] str, int amountOfLetters) {
        char[] buffer = resize(amountOfLetters);
        int insertPosition = 0;
        for (int i = 0; i < getSize(str); ++i) {
            if (str[i] != ' ') {
                buffer[insertPosition] = str[i];
                LOGGER.debug("insert '" + str[i] + "' to pos " + insertPosition);
                ++insertPosition;
                if (insertPosition != buffer.length) {
                    buffer[insertPosition] = ' ';
                    LOGGER.debug("insert ' ' to pos " + insertPosition);
                    ++insertPosition;
                }
            }
        }
        return buffer;
    }

    protected char[] convertToChar(String str){
        int strSize = str.length();
        char[] buffer = str.toCharArray();
        char[] result = new char[strSize + 1];

        System.arraycopy(buffer, 0, result, 0, buffer.length);
        result[strSize] = '\0';

        return result;
    }

    @Override
    public String removeSymbols(String string) {
        char[] str = convertToChar(string);

        int amountOfLetters = 0;
        // deleting all non-letter symbols
        for (int i = 0; i < getSize(str); ++i) {
            if (str[i] < 'a' || str[i] > 'z') {
                str[i] = ' ';
            } else {
                ++amountOfLetters;
            }
        }
        str[str.length - 1] = '\0';

        // inserting spaces between letters
        char[] result = insertSpaces(str, amountOfLetters);

        LOGGER.info("Separate all letter by spaces");
        return new String(result);
    }

    protected int getWord(char[] str, int start) {
        int finish;
        for (finish = start; str[finish] >= 'a' && str[finish] <= 'z'; ++finish){}
        return finish;
    }

    @Override
    public String replaceLetter(String string) {
        char[] str = convertToChar(string);
        char[] result = new char[str.length - 1];

        for (int i = 0; i < str.length; ++i) {
            int endOfWord = getWord(str, i);
            int wordLen = endOfWord - i;
            if (wordLen >= replacePosition) {
                str[i + replacePosition - 1] = substitute;
            }
            for (int begin = i; begin < endOfWord; ++begin) {
                result[begin] = str[begin];
            }
            if (endOfWord != result.length) {
                result[endOfWord] = ' ';
            }
            i += wordLen;
        }

        LOGGER.info("Replace K-th symbol in the words");
        return new String(result);
    }
}
