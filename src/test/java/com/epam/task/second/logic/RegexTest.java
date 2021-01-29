package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {

    private final String TEST_REMOVE_INSERT = "he9 llo.wo7rl98d";
    private final String EXPECTED_RI = "h e l l o w o r l d";

    private final String TEST_REPLACE_K = "hello world text file to test classes";
    private final String EXPECTED_RK = "hell_ worl_ text file to test clas_es";

    @Test
    public void testRemoveSymbolsShouldRemoveAllNonLiteralsAndInsertSpaces() {
        RegexMethods reg = new RegexMethods();

        String result = reg.removeSymbols(TEST_REMOVE_INSERT);

        Assert.assertEquals(EXPECTED_RI, result);
    }

    @Test
    public void testReplaceLetterShouldReplaceKthSymbol() {
        RegexMethods reg = new RegexMethods();

        String result = reg.replaceLetter(TEST_REPLACE_K);

        Assert.assertEquals(EXPECTED_RK, result);
    }

}
