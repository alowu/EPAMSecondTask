package com.epam.task.second.logic;

public interface TextProcessor {

    int replacePosition = 5;
    String delimiter = " ";
    char substitute = '_';

    String removeSymbols(String string);

    String replaceLetter(String string);
}
