package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();

        initializeCompetitors();

        boolean winnerNotKnown = true;
        int competitorsWithoutFuel = 0;

        while(winnerNotKnown && competitorsWithoutFuel < competitors.size()){
            for (Vehicle vehicle:competitors){
                double speed = getAccelerationSpeedFromUser();
                vehicle.accelerate(speed,1);
                if(selectedTrack.getLenght() <= vehicle.getTraveledDistance()) {
                    winnerNotKnown = false;
                    System.out.println("The winner is: " + vehicle.getName());
                    break;
                }
                if(vehicle.getFuelLevel() <= 0){
                    competitorsWithoutFuel ++;
                }
            }
        }
    }

    private double getAccelerationSpeedFromUser(){
        System.out.println("Please enter acceleration speed: ");
        Scanner scanner = new Scanner(System.in);

        try{
            return scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid value!");
            return getAccelerationSpeedFromUser();
        }
    }

    private int getCompetitorCountFromUser() throws Exception{
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            throw new Exception("You have entered an invalid number!");
        }
    }

    private Track getSelectedTrackFromUser(){
        System.out.println("Select a track: ");
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        try{
            userChoice = scanner.nextInt();
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("You have entered an invalid value. \n Please enter a valid number: ");
            return getSelectedTrackFromUser();
        }
        return tracks[userChoice - 1];
    }

    public void initializeCompetitors() throws Exception {
        int competitorCount = getCompetitorCountFromUser();
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
        track2.setLenght(10000);
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
