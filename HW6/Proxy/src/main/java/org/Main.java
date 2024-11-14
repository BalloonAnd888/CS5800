package HW6.Proxy.src.main.java.org;

public class Main {
    public static void main(String[] args) {
        RealSong realSong = new RealSong();

        realSong.addSong(new Song(1, "Song A", "Artist 1", "Album A", 200));
        realSong.addSong(new Song(2, "Song B", "Artist 2", "Album B", 300));
        realSong.addSong(new Song(3, "Song C", "Artist 1", "Album A", 400));
        realSong.addSong(new Song(4, "Song D", "Artist 3", "Album C", 500));
        realSong.addSong(new Song(5, "Song E", "Artist 2", "Album D", 600));
        realSong.addSong(new Song(6, "Song F", "Artist 4", "Album E", 700));
        realSong.addSong(new Song(7, "Song G", "Artist 5", "Album F", 800));

        SongService proxy = new SongProxy(realSong);

        System.out.println(proxy.searchById(1));
        System.out.println(proxy.searchById(3));
        System.out.println(proxy.searchById(4));

        System.out.println(proxy.searchByTitle("Song A"));
        System.out.println(proxy.searchByTitle("Song D"));
        System.out.println(proxy.searchByTitle("Song G"));

        System.out.println(proxy.searchByAlbum("Album A"));
        System.out.println(proxy.searchByAlbum("Album E"));
        System.out.println(proxy.searchByAlbum("Album F"));
    }
}