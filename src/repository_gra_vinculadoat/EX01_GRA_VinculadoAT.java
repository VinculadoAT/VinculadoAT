package repository_gra_vinculadoat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Atila Vinculado
 */
public class EX01_GRA_VinculadoAT {
    public static void main(String[] args) {
           String name1 = "William";
           int age1 = 14;
           double mmr1 = 500.5;
           
            System.out.println("Name: " + name1);
            System.out.println("Age: "+ age1);
            System.out.println("MMR: " + mmr1);
        
           String name2 = "Jay";
           int age2 = 16;
           double mmr2 = 3000.5;
           
            System.out.println("\nName: " + name2);
            System.out.println("Age: "+ age2);
            System.out.println("MMR: " + mmr2);
           
           String name3 = "Nic";
           int age3 = 15;
           double mmr3 = 2800.8;
           
            System.out.println("\nName: " + name3);
            System.out.println("Age: "+ age3);
            System.out.println("MMR: " + mmr3);
           
           double TotalMMR = mmr1 + mmr2 + mmr3;
           System.out.println("\nTotal MMR: " + TotalMMR);
           
           boolean AgeCheck = (age1 == age2 && age1 == age3);
           System.out.println("The 3 people have the same age: " + AgeCheck);
           
           boolean JayHighest = mmr2 > (mmr1 + mmr3);
           System.out.println("Jay has a higher MMR than Nic and William combined: " + JayHighest);
    }    
}
