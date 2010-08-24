package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GolfTrackerTest {

    @Test
    public void zaehltEinenSchlag() throws Exception {
        Tracker tracker = new Tracker();
        assertThat(tracker.reagiereAuf("Schlage Ball"), is("Du hast 1 Schlag."));
    }
}
