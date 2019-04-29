package com.sheby;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantOrVowelTest {
    private ConsonantOrVowel consonantOrVowel;

    @Before
    public void setUp() throws Exception {
        consonantOrVowel=new ConsonantOrVowel("c");
    }

    @After
    public void tearDown() throws Exception {
        consonantOrVowel=new ConsonantOrVowel("c");
    }


    @Test
    public void checkConsonant() {
        String input=consonantOrVowel.checkConsonantOrVowel("c");
        assertEquals("Consonant",input);
    }

    @Test
    public void checkVowels() {
        String input=consonantOrVowel.checkConsonantOrVowel("e");
        assertEquals("Vowel",input);
    }

    @Test
    public void checkValidity() {
        String input=consonantOrVowel.checkConsonantOrVowel("9");
        assertEquals("Error",input);
    }
}