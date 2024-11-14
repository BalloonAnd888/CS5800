package HW6.Proxy.src.main.java.org;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService{
    private RealSong realSong;
    private Map<Integer, Song> cache;

    public SongProxy(RealSong realSong) {
        this.realSong = realSong;
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if(cache.containsKey(songID)) {
            return cache.get(songID);
        }
        Song song = realSong.searchById(songID);
        cache.put(songID, song);
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return realSong.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return realSong.searchByAlbum(album);
    }
}
