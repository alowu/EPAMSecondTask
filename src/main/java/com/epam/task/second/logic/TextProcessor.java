package com.epam.task.second.logic;

public interface TextProcessor {

    String removeAllNonWordSymbols = "[\\d+\\W ]";
    String insertSpaces = "[a-z]";
    String spaces = "$0 ";
    String trimSpaces = "^\\s+|\\s+$";
    String empty = "";
    /*String replaceLast = "\\w{5}";
    String substituteST = "$0_";*/

    int replacePosition = 5;
    String delimiter = " ";
    char substituteCH = '_';

    String removeSymbols(String string);

    String replaceLetter(String string);
}
