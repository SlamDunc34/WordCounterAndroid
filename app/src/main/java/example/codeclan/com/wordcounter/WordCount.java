package example.codeclan.com.wordcounter;

/**
 * Created by user on 18/04/2017.
 */

public class WordCount {
    public static int countWords(String words){
        //if s was hello world
        String[] array = words.split(" ");
        //array would be [hello, world]
        //array would be [hello, world, my, name, is, darren]
        return array.length;
    }
}
