package head.first.java.chapter16;

import java.util.Objects;

public class Song implements Comparable<Song>{
    String title;
    String artists;
    String rating;
    String bpm;
    public Song(String title, String artists, String rating, String bpm) {
        this.title = title;
        this.artists = artists;
        this.rating = rating;
        this.bpm = bpm;
    }

    public boolean equals(Object o) {
        Song song = (Song) o;
        return getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public String getTitle () {
        return  title;
    }

    public String getArtists() {
        return artists;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song song) {
        return title.compareTo(song.getTitle());
    }

    public int compareToArtists(Song song) {
        return artists.compareTo(song.getArtists());
    }
    public int compareToRating(Song song) {
        return rating.compareTo(song.getRating());
    }
    public int compareToBpm(Song song) {
        return bpm.compareTo(song.getBpm());
    }
}
