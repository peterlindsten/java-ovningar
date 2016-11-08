package se.inceptive;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/* Ta bort denna rad och motsvarande rad längst ned i filen för att använda testen

// Enhetstest för inlämnngen split

public class splitTest {
    @Test
    public void testSplitSingle() {
        String input1 = "1. Menyval\n";
        String input2 = "\n";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1. Menyval");

        ArrayList<String> actual = App.split(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSplitMultiple() {
        String input1 =
                "1. Menyval 1\n" +
                        "2. Menyval 2\n" +
                        "3. Menyval 3\n";
        String input2 = "\n";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1. Menyval 1");
        expected.add("2. Menyval 2");
        expected.add("3. Menyval 3");

        ArrayList<String> actual = App.split(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSplitNone() {
        String input1 = "1. Menyval 1";
        String input2 = "\n";

        ArrayList<String> expected = new ArrayList<String>();
        expected.add(input1);

        ArrayList<String> actual = App.split(input1, input2);

        assertEquals(expected, actual);
    }
}
Ta bort denna rad för att använda testen */
