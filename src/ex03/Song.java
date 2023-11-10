/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author Atila Vinculado
 */
public class Song {

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    private String favoriteSong;
   
    public Song(String Song1) {
        favoriteSong = Song1;
    }
}

