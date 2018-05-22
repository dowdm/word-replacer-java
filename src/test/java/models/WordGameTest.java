package models;

import org.junit.*;
import static org.junit.Assert.*;

public class WordGameTest {

    @Test
    public void replaceWord_returnsOriginalString_originalstring() throws Exception {
        WordGame testWordGame = new WordGame();
        String expected = "drink more coffee";
        assertEquals(expected, testWordGame.replaceWord("drink more coffee", "", ""));
    }

    @Test
    public void replaceWord_returnsStringWithNewWords_editedstring() throws Exception {
        WordGame testWordGame = new WordGame();
        String expected = "drink less coffee";
        assertEquals(expected, testWordGame.replaceWord("drink more coffee", "more","less"));
    }

    @Test
    public void replaceWord_returnsStringWithReplacedWordsAndPartials_editedstring() throws Exception {
        WordGame testWordGame = new WordGame();
        String expected = "drink dog coffee dogegory";
        assertEquals(expected, testWordGame.replaceWord("drink cat coffee category", "cat","dog"));
    }
}
