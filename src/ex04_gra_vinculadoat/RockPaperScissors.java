//EX04_GRA_VinculadoAT
package ex04_gra_vinculadoat;

import java.util.Scanner;

/**
 *
 * @author evinc
 */
public class RockPaperScissors{
    int roundsToWin = 2;
    
    public void Welcome(Move rock, Move paper, Move scissors){
     System.out.print("Welcome to Rock, Paper, Scissors. \n\nPlease choose an option: \n1. Start game \n2. Change number of rounds \n3. Exit application \n\n>");
     Choice(roundsToWin, rock, paper, scissors);
 }
 public void Choice(int roundsToWin, Move rock, Move paper, Move scissors){

     Scanner scanner = new Scanner(System.in);
     String choice = scanner.nextLine();
     
     switch (choice) {
     
     case "1":
        startGame(roundsToWin, rock, paper, scissors);
        Welcome(rock, paper, scissors);
        break;
     
     case "2":
        
       changeNoOfRounds();
        Welcome(rock, paper, scissors);
        break;
     
     case "3":
         System.out.println("Thank you for playing.");
         break;
         
     default:
         System.out.println("Invalid input. Please try again");
         Welcome(rock, paper, scissors);
         break;
    
 } 
             
 }
 public void startGame(int roundsToWin, Move rock, Move paper, Move scissors){
     int pScore = 0;
     int cScore = 0;
     if(roundsToWin>1){
         
     System.out.println("This match will be first to " + roundsToWin + " wins");
         
     }else{
     System.out.println("This match will be first to " + roundsToWin + " win");
     }
     System.out.println("The computer has selected its move. Select your move: ");
     System.out.println("1. Rock \n2. Paper \n3. Scissors \n ");
 
     
     while(!(pScore >= roundsToWin || cScore >= roundsToWin)){
     int cMove = (int) Math.floor(Math.random()*3) + 1;
     Move computermove = new Move("move");;
                 if(cMove == 1){
               computermove = rock;
            }else if(cMove == 2){
                computermove = paper;
            }else if(cMove == 3){
                computermove = scissors;
            }
                 
     Scanner scanner = new Scanner(System.in);
     String pMove = "";
     while(true){
         System.out.print(">" );
        pMove = scanner.nextLine();
         
        if(pMove.equals("1")||pMove.equals("2")||pMove.equals("3")){
        break;
        }else{
            System.out.println("Invalid Input");
        }
     }
     Move playermove = new Move("move");
             
  
            if(pMove.equals("1")){
               playermove = rock;
            }else if(pMove.equals("2")){
                playermove = paper;
            }else if(pMove.equals("3")){
                playermove = scissors;
            }
            
            
        
       int result = playermove.compareMoves(playermove, computermove);
        if (result==2) {
        System.out.println("Player chose " + playermove.getName() + ". Computer Chose " + computermove.getName()+ ". Round is Tied!"  );
            System.out.println("Player: " + pScore + " - Computer: " + cScore);
            
             System.out.println("The computer has selected its move. Select your move: ");
            System.out.println("1. Rock \n2. Paper \n3. Scissors \n ");
        }
        else if (result==0) {
            pScore++;
            System.out.println("Player chose " + playermove.getName() + ". Computer Chose " + computermove.getName()+ ". Player wins round!"  );
            System.out.println("Player: " + pScore + " - Computer: " + cScore);
            
             System.out.println("The computer has selected its move. Select your move: ");
            System.out.println("1. Rock \n2. Paper \n3. Scissors \n ");
        }
        else if (result==1) {
            cScore++;
            System.out.println("Player chose " + playermove.getName() + ". Computer Chose " + computermove.getName()+ ". Computer wins round!"  );
            System.out.println("Player: " + pScore + " - Computer: " + cScore);
            
             System.out.println("The computer has selected its move. Select your move: ");
            System.out.println("1. Rock \n2. Paper \n3. Scissors \n ");
        }
        
    }
     if(pScore>cScore){
         System.out.println("Player Wins!");
     }else{
      System.out.println("Computer Wins!");
     }
     
 }

  
 
 public void changeNoOfRounds(){
      Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("How many wins are needed to win a match? \n> ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    roundsToWin = number;
                    System.out.println("New setting has been saved! \n");
                    break;
                }
            }else{
            scanner.nextLine(); // Consume invalid input
            System.out.println("Invalid input. Please enter a positive integer.");
            }
            }
    }
     
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                
        RockPaperScissors RPS = new RockPaperScissors();
        RPS.Welcome(rock, paper, scissors);
	}
 
}
