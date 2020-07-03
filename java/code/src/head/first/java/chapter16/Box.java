package head.first.java.chapter16;
import java.io.*;
import java.util.*;

public class Box {
    ArrayList songList;
    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getArtists().compareTo(two.getArtists());
        }
    }
    public void go() {
        songList = new ArrayList<Song>();
        getSongs();
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
        System.out.println(songSet);
    }
    private void getSongs() {
        try {
            File file = new File("SongLists.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void addSong(String line) {
        String[] tokens = line.split("/");
        if (tokens.length == 4) {
            Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
            songList.add(nextSong);
        }
    }
}
