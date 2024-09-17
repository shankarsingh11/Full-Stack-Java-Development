package Projects;

import java.util.*;

class Guesser{
	int guessNum;
	 int guessValidNum;
	
	int guessNum(){
		Random random = new Random();
		System.out.println("Welcome to the world of guessing number game:");
		guessNum = random.nextInt(10000);
		System.out.println(guessNum);
	  //guessNum = scan.nextInt();
	    return guessNum;
	     
	}
}

class Player{
	   
        int guessNum;
        int guessValidNum;
	    int guessNum(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly   guess number ");
		guessNum = scan.nextInt();
		return guessNum;
	
	}  
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	
	void collectNumFromPlayers() {	
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() {
		
		if(numFromGuesser>0) {
			
			if(numFromPlayer1 > 0 && numFromPlayer1 <= 100) {
				
				 if(numFromPlayer2 > 0 && numFromPlayer2 <= 100) {
					 
					 if( numFromPlayer3 > 0 && numFromPlayer3 <= 100) {
						 
						 if(numFromGuesser == numFromPlayer1) {
							 
							 if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
								 
								 System.out.println("All Player won a game");
								 
							 }else if(numFromGuesser == numFromPlayer2){
								 
								System.out.println("Player 1,2 won a game ");
								
							 }else if(numFromGuesser == numFromPlayer3) {
								 
								 System.out.println("Player 1,3 won a game ");
								 
							 }else {
								 
								 System.out.println("Player 1 won a game");
							 }
							 
						 }else if(numFromGuesser == numFromPlayer2) {
							 
							   if(numFromGuesser == numFromPlayer3) {
								  
								  System.out.println("Player 2,3 won a game ");
								  
							  }else {
								  
								  System.out.println("Player 2 won a game ");
							  }
						 }else if(numFromGuesser == numFromPlayer3){
							 
							 System.out.println("Player 3 won a game ");
							 
						 }else {
							 
							 System.out.println("Game lost try Again");
						 }
						 
					 }else {
						 
						System.out.println("Not valid number guess from Player3");
					 }
					 
				 }else {
					 
					 System.out.println("Not valid number guess from Player2");
				 }
			}else
			{
				System.out.println("Not valid number guess from Player1");
			}
		}else 
		{
			System.out.println("Not valid number guess from guesser");
		}
	   
	 }		
			
}
	
public class GuesserGame {

	public static void main(String[] args) {
		
		Umpire ur = new Umpire();
		ur.collectNumFromGuesser();
		ur.collectNumFromPlayers();
		ur.compare();
		
	}

}
