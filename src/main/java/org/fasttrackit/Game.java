package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start(){
        initializeTracks();
        displayTracks();
        initializeCompetitors();


    }
    public void initializeCompetitors(){
        int competitorCount = 2;
        System.out.println("Today's competitors are: ");
        for(int i = 0; i < competitorCount;i++){
            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6,12));
            competitor.setFuelLevel(80);

            System.out.println(competitor);

            competitors.add(competitor);
        }
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
