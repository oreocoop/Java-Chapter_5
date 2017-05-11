import java.util.ArrayList;

/**
 * Created by rcooper2 on 3/15/2017.
 */
public class Album {

    String albumName;
    String albumArtist;
    String albumGenre;
    int albumYear;
    int numberOfTracksOnAlbum;
    ArrayList<Song> songs;


    //constructor
    public Album(String albumName, String albumArtist, String albumGenre, int albumYear, int numberOfTracksOnAlbum) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumGenre = albumGenre;
        this.albumYear = albumYear;
        this.numberOfTracksOnAlbum = numberOfTracksOnAlbum;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }


    //getters
    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public String getAlbumGenre() {
        return albumGenre;
    }

    public int getAlbumYear() {
        return albumYear;
    }

    public int getNumberOfTracksOnAlbum() {
        return numberOfTracksOnAlbum;
    }

    //setters
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public void setAlbumGenre(String albumGenre) {
        this.albumGenre = albumGenre;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }

    public void setNumberOfTracksOnAlbum(int numberOfTracksOnAlbum) {
        this.numberOfTracksOnAlbum = numberOfTracksOnAlbum;
    }
}
