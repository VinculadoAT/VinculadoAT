/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

/**
 *
 * @author Atila Vinculado
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Audience Watchers1 = new Audience();
        Audience Watchers2 = new Audience();
        Audience Watchers3 = new Audience();
        Song favoriteSong = new Song("Enchanted");
        Song favoriteSong2 = new Song("Mean");
        Singer Artist = new Singer("Taylor", favoriteSong);
        Singer Artist2 = new Singer("Joe", favoriteSong);
        

                
        System.out.println("Singer: " + Artist.getName());
        System.out.println("Concert no.: " + Artist.getNoOfPerformances());
        System.out.println("Earnings: " + Artist.getEarnings() + "$");
        System.out.println("Favorite Song: " + favoriteSong.getFavoriteSong());
        Artist.performForAudience(12);
        Artist.performForAudience(16, Artist2);
                
        
        System.out.println("\n\nTaylor is now changing her favorite song");
        Artist.changeFavSong(favoriteSong2);
        System.out.println("Favorite Song: " + favoriteSong2.getFavoriteSong());
    }
    
}
