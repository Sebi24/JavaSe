package org.fasttrackit;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];

    public void start(){
        initializeTracks();
        displayTracks();


    }
    private void initializeTracks(){
        Track track1 = new Track();
        track1.setName("First Track");
        track1.setLenght(300);
        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Second Track");
        track2.setLenght(500);
        tracks[1] = track2;

//        Track track3 = new Track();
//        track3.setName("Simoncelli");
//        track3.setLenght(150);
//        tracks[2] =  track3;
    }
    private void displayTracks(){
        System.out.println("Available tracks: ");
        for(Track track:tracks){
            if(track != null){
                System.out.println("The track name is: " + track.getName() + ", the length is: " + track.getLenght()+".");
            }
        }
    }
}
