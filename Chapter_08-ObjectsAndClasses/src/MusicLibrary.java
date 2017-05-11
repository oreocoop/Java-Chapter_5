import java.util.ArrayList;

/**
 * Created by rcooper2 on 3/15/2017.
 */
public class MusicLibrary {

    private ArrayList<Album> albums = new ArrayList<Album>();

    public void addAlbum(Album theAlbum) {
        this.albums.add(theAlbum);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

}
