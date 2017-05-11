import java.util.Scanner;

/**
 * Created by rcooper2 on 3/16/2017.
 */
public class Main {

    public static void main(String[] args){

        MusicLibrary MusicLibraryRich = new MusicLibrary();
        Scanner songInput = new Scanner(System.in);
        Scanner albumInput = new Scanner(System.in);

        Song song1 = new Song(getSongNameFromUser(songInput));




//        Song s1 = new Song("Dirty Deeds", 3);
//        Album a1 = new Album("The Album name", "AC/DC", "ROCK", 1985, 15);
//        a1.addSong(s1);
//        MusicLibraryRich.addAlbum(a1);
        //System.out.println("Number of Songs in the library: " + Song.getSongs().size());
        System.out.println("Number of Albums in the library: " + MusicLibraryRich.getAlbums().size());

    }

    public static String getSongNameFromUser(Scanner inScanner){

        String songNameFromUser;
        System.out.println("Please enter a song name: ");
        songNameFromUser = inScanner.nextLine();

        return songNameFromUser;
    }
    public static String getSongGnereFromUser(Scanner inScanner) {

        System.out.println("Please enter the genre: ");

        return "";
    }
    public static int getSongTrackNumberFromUser(Scanner inScanner) {

        System.out.println("Please enter the track number: ");

        return 1;
    }
}
