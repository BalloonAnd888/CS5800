package HW6.Proxy.src.main.java.org;

public class Song {
    private int id;
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(int id, String title, String artist, String album, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Album: " + album + ", Duration: " + duration;
    }
}
