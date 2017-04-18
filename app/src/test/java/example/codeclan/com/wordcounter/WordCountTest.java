package example.codeclan.com.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCountTest {

    @Test
    public void testWordCount() {
        int count = WordCount.countWords("Hello world nice to see you");
        assertEquals(6, count);
    }

    @Test
    public void testWordCountTwo() {
        int count = WordCount.countWords("Hello world");
        assertEquals(2, count);
    }

    @Test
    public void testWordCountThree() {
        int count = WordCount.countWords("Hello world nice");
        assertEquals(3, count);
    }


}
