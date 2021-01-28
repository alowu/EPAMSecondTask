package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void testRemoveSymbolsShouldRemoveAllNonLiteralsAndInsertSpaces() {
        StringMethods rep = new StringMethods();

        String res = rep.removeSymbols("he9 llo.wo7rl98d");

        Assert.assertEquals("h e l l o w o r l d", res);
    }
}
