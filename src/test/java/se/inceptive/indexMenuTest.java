package se.inceptive;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/* Ta bort denna rad och motsvarande rad längst ned i filen för att använda testen

// Enhetstest för inlämningen indexMenu

public class indexMenuTest {
    @Test
    public void testIndexMenuSingle()
    {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Menyval 1");
        String expected = "1. Menyval 1\n";

        String actual = App.indexMenu(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexMenuMultiple() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Menyval 1");
        input.add("Menyval 2");
        input.add("Menyval 3");
        String expected = "1. Menyval 1\n" +
                "2. Menyval 2\n" +
                "3. Menyval 3\n";

        String actual = App.indexMenu(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testIndexMenuNone() {
        ArrayList<String> input = new ArrayList<String>();
        String expected = "";

        String actual = App.indexMenu(input);

        assertEquals(expected, actual);
    }
}
Ta bort denna rad för att använda testen */
