package HW6.Proxy.src.test.java;

import HW6.Proxy.src.main.java.org.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {
    @Test
    public void testGetID() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals(1, song.getId());
    }

    @Test
    public void testGetTitle() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals("Song 1", song.getTitle());
    }

    @Test
    public void testGetArtist() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals("Artist 1", song.getArtist());
    }

    @Test
    public void testGetAlbum() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals("Album 1", song.getAlbum());
    }

    @Test
    public void testGetDuration() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals(180, song.getDuration());
    }
}
