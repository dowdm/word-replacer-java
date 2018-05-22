package models;

import org.junit.*;
import static org.junit.Assert.*;

public class WordGameTest {
    @Test
    public void replaceWord_returnsOriginalString_originalstring() throws Exception {
        WordGame testWordGame = new WordGame();
        String expected = "drink more coffee";
        assertEquals(expected, testWordGame.replaceWord("drink more coffee"));
    }
}