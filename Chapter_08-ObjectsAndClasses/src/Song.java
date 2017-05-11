import java.util.ArrayList;

/**
 * Created by rcooper2 on 3/15/2017.
 */
public class Song {

    String name;
    String genre;
    int trackNumber;
    ArrayList<Song> listOfSongs = new ArrayList<Song>();

    //constructors
    public Song(String songName) {
        this.name = songName;
    }
    public Song(String name, int trackNo) {
        this.name = name;
        this.trackNumber = trackNo;
    }
    public Song(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    public Song(String songName, String genre, int trackNumber) {
        this.name = songName;
        this.genre = genre;
        this.trackNumber = trackNumber;
    }











    //getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public static ArrayList<Song> getSongs(ArrayList<Song> listOfSongs) {
        ArrayList<Song> songs = new ArrayList<Song>(listOfSongs);
        return songs;
    }
}
