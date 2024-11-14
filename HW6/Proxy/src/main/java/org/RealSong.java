package HW6.Proxy.src.main.java.org;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealSong implements SongService{
    private Map<Integer, Song> songs;

    public RealSong() {
        songs = new HashMap<>();
    }

    public void addSong(Song song) {
        songs.put(song.getId(), song);
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return songs.values().stream()
                .filter(song -> song.getTitle().equalsIgnoreCase(title)).toList();
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return songs.values().stream()
                .filter(song -> song.getAlbum().equalsIgnoreCase(album)).toList();
    }
}
