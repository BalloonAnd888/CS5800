package HW6.Proxy.src.test.java;

import HW6.Proxy.src.main.java.org.RealSong;
import HW6.Proxy.src.main.java.org.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealSongTest {
    private RealSong realSong;

    @BeforeEach
    public void setup() {
        realSong = new RealSong();
        realSong.addSong(new Song(1, "Song A", "Artist 1", "Album X", 200));
        realSong.addSong(new Song(2, "Song B", "Artist 2", "Album Y", 240));
        realSong.addSong(new Song(3, "Song C", "Artist 1", "Album X", 180));
        realSong.addSong(new Song(4, "Song D", "Artist 3", "Album Z", 220));
    }

    @Test
    public void testSearchById() {
        Song song = realSong.searchById(1);
        assertEquals("Song A", song.getTitle());
    }

    @Test
    public void testSearchByTitle() {
        List<Song> songs = realSong.searchByTitle("Song A");
        assertEquals(1, songs.size());
        assertEquals("Song A", songs.get(0).getTitle());
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> songs = realSong.searchByAlbum("Album X");
        assertEquals(2, songs.size());
    }
}
