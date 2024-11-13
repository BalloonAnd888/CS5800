package HW6.Proxy.src.test.java;

import HW6.Proxy.src.main.java.org.RealSong;
import HW6.Proxy.src.main.java.org.Song;
import HW6.Proxy.src.main.java.org.SongProxy;
import HW6.Proxy.src.main.java.org.SongService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongProxyTest {
    private SongService proxy;

    @BeforeEach
    public void setUp() {
        RealSong realSongService = new RealSong();
        realSongService.addSong(new Song(1, "Song A", "Artist 1", "Album X", 200));
        realSongService.addSong(new Song(2, "Song B", "Artist 2", "Album Y", 240));
        realSongService.addSong(new Song(3, "Song C", "Artist 1", "Album X", 180));
        realSongService.addSong(new Song(4, "Song D", "Artist 3", "Album Z", 220));

        proxy = new SongProxy(realSongService);
    }

    @Test
    public void testSearchById() {
        Song song = proxy.searchById(1);
        assertEquals("Song A", song.getTitle());
    }

    @Test
    public void testSearchByTitle() {
        List<Song> songs = proxy.searchByTitle("Song A");
        assertEquals(1, songs.size());
        assertEquals("Song A", songs.get(0).getTitle());
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> songs = proxy.searchByAlbum("Album X");
        assertEquals(2, songs.size());
    }
}
