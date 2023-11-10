/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author Atila Vinculado
 */
public class Singer {

    public static int getTotalPerformances(){
        return totalPerformances;
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }
    

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    private String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    private Song favoriteSong; 
    
    public Singer(String name2, Song favoriteSong) {
        name = name2;
        noOfPerformances = 0;
        earnings = 0;
        favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int noOfAttendees) {
        setNoOfPerformances(getNoOfPerformances() + 1);
        setTotalPerformances(getTotalPerformances() + 1);
        setEarnings(getEarnings() + noOfAttendees * 100);
        System.out.println("\n\n" + getName() + " is performing for a crowd!");
        System.out.println("Singer: " + getName());
        System.out.println("Concert no.: " + getNoOfPerformances());
        System.out.println("Earnings: " + getEarnings() + "$");
    }
    
    public void performForAudience(int noOfAttendees, Singer singer2) {
        setNoOfPerformances(getNoOfPerformances() + 1);
        singer2.setNoOfPerformances(singer2.getNoOfPerformances() + 1);
        setTotalPerformances(getTotalPerformances() + 1);
        setEarnings(getEarnings() + noOfAttendees * 50);
        singer2.setEarnings(singer2.getEarnings() + noOfAttendees * 50);
        System.out.println("\n\n" + getName() + " and " + singer2.getName() + " are performing for a crowd!");
        System.out.println("Singers: " + getName() + " and " + singer2.getName());
        System.out.println("Total Performances: " + getTotalPerformances());
        System.out.println("\nTaylor's Concert no.: " + getNoOfPerformances());
        System.out.println("Joe's Concert no.: " + singer2.getNoOfPerformances());
        System.out.println("\nTaylor's total earnings: " + getEarnings() + "$");
        System.out.println("Joe's earnings: " + singer2.getEarnings() + "$");
    }
    
    public void changeFavSong(Song Song2){
        setFavoriteSong(Song2);

    }

    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
}

