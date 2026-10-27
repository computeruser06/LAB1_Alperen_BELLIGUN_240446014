/**
 * PlaylistDemo.java
 * This program tests the Track class to see if it works.
 *
 *   Your Name:        Alperen BELLİGÜN
 *   Your Student ID:  240446014
 *   Your Date:        05.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("--- Starting Playlist Demo ---");
        System.out.println(); // empty line

        // test 1: no inputs (default constructor)
        System.out.println("First track (default): ");
        Track track1 = new Track();
        System.out.println(track1.toString()); // call toString explicitly
        System.out.println(""); // empty line

        // test 2: only title
        System.out.println("Second track (only title):");
        Track track2 = new Track("Neon Lights");
        System.out.println(track2);
        System.out.println();

        // test 3: title and artist
        System.out.println("Third track (title and artist):");
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(track3);
        System.out.println();

        // test 4: all inputs (normal song)
        System.out.println("Fourth track (full info):");
        Track track4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(track4);
        System.out.println();

        // test 5: minus time test (it should give error message)
        System.out.println("Minus time test:");
        Track track5 = new Track("Broken Clock", "Static Noise", -15, false);
        System.out.println(track5);
        System.out.println();

        // test 6: testing the get methods
        System.out.println("Testing get methods:");
        Track track6 = new Track("Stardust", "Stellar Echo", 242, true);

        System.out.println("Song Name: " + track6.getTitle());
        System.out.println("Singer:    " + track6.getArtist());
        System.out.println("Time:      " + track6.getDurationFormatted());

        // checking if song has bad words
        if (track6.isExplicit() == true) {
            System.out.println("Explicit:  Yes");
        } else {
            System.out.println("Explicit:  No");
        }
    }
}