/**
 * Track.java
 * This class is for a music song in a playlist.
 *
 *   Your Name:        Alperen BELLİGÜN
 *   Your Student ID:  240446014
 *   Your Date:        05.10.2026
 */
public class Track {

    // class variables
    private String artist;
    private String title;
    private boolean isExplicit; // true if song has bad words
    private int durationSeconds; // time in seconds

    // main constructor. it sets all variables.
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;

        // check time. it cannot be smaller than 0.
        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds; }
         else {
            System.out.println("Error: Time is wrong. I will set it to 0.");
            this.durationSeconds = 0; }

        this.isExplicit = isExplicit; }

    // constructor for only title and artist
    public Track(String title, String artist) {
        this(title, artist, 0, false);  } // call main constructor


    // constructor for only title
    public Track(String title) {
        this(title, "Unknown Artist", 0, false); }


    // default constructor (no inputs)
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false); }


    // get methods
    public String getTitle() {
        return title; }


    public String getArtist() {
        return artist; }


    public int getDurationSeconds() {
        return durationSeconds; }


    public boolean isExplicit() {
        return isExplicit; }


    // make time string like "3:05"
    public String getDurationFormatted() {
        int m = durationSeconds / 60; // minutes
        int s = durationSeconds % 60; // seconds

        // if seconds is zero to nine, we need a zero before it
        if (s < 10) {
            return m + ":0" + s; }
         else {
            return m + ":" + s; }
    }

    // write the track info as text
    @Override
    public String toString() {
        String text = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";

        // if it is explicit, add a warning tag
        if (isExplicit == true) {
            text = text + " [EXPLICIT]"; }

        return text; }
}