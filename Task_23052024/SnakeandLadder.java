package SLG;
import java.util.Scanner;

public class SnakeandLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the player number:");
        int p=sc.nextInt();
        if (p > 2) {
            System.out.println("The game is set for only 2 players.");
            return;
        }
        int p1=1;
        int p2=1;
        boolean currentPlayer=true;
        while(true) {
        	int d = (int)(Math.random() * 6) + 1;
            System.out.println("The dice score is:"+d);
            if(currentPlayer) {
                p1=p1+d;
                System.out.println("Player 1's score: " + p1);
                System.out.println("Player 2's score: " + p2);
                System.out.println("Now it is player 2's turn");
                //ladders
                if(p1==4) {
                    System.out.println("The player1 encountered a ladder" );
                    p1=25;
                    System.out.println("The player 1's score is now"+ p1 );
                    
                }
                else if(p1==13) {
                    System.out.println("The player1 encountered a ladder" );
                    p1=46;
                    System.out.println("The player 1's score is now"+ p1 );
                }
                else if(p1==50) {
                    System.out.println("The player1 encountered a ladder" );
                    p1=69;
                    System.out.println("The player 1's score is now"+ p1 );
                }
                else if(p1==74) {
                    System.out.println("The player1 encountered a ladder" );
                    p1=92;
                    System.out.println("The player 1's score is now"+ p1);
                }
                //snakes
                else if(p1==27) {
                    System.out.println("The player1 encountered a snake" );
                    p1=5;
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1==43) {
                    System.out.println("The player1 encountered a snake" );
                    p1=18;
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1==66) {
                    System.out.println("The player1 encountered a snake" );
                    p1=36;
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1==89) {
                    System.out.println("The player1 encountered a snake" );
                    p1=53;
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1==99) {
                    System.out.println("The player1 encountered a snake" );
                    p1=20;
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1==98 && d==4) {
                    System.out.println("The player1 has to skip his/her chance" );
                    System.out.println("The player 1's score is now"+ p1);
                }
                else if(p1>=100) { 
                    System.out.println("The player1 wins");
                    break; 
                }
            }
            else {
                p2=p2+d;
                System.out.println("Player 1's score: " + p1);
                System.out.println("Player 2's score: " + p2);
                System.out.println("Now it is player 1's turn");
                //ladders
                if(p2==4) {
                    System.out.println("The player2 encountered a ladder" );
                    p2=25;
                    System.out.println("The player 2's score is now" + p2);
                }
                else if(p2==13) {
                    System.out.println("The player2 encountered a ladder" );
                    p2=46;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==50) {
                    System.out.println("The player2 encountered a ladder" );
                    p2=69;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==74) {
                    System.out.println("The player2 encountered a ladder" );
                    p2=92;
                    System.out.println("The player 2's score is now"+ p2);
                }
                //snakes
                else if(p2==27) {
                    System.out.println("The player2 encountered a snake" );
                    p2=5;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==43) {
                    System.out.println("The player2 encountered a snake" );
                    p2=18;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==66) {
                    System.out.println("The player2 encountered a snake" );
                    p2=36;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==89) {
                    System.out.println("The player2 encountered a snake" );
                    p2=53;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==99) {
                    System.out.println("The player2 encountered a snake" );
                    p2=20;
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2==98 && d==4) {
                    System.out.println("The player2 has to skip his/her chance" );
                    System.out.println("The player 2's score is now"+ p2);
                }
                else if(p2>=100) { 
                    System.out.println("The player2 wins");
                    break; 
                }
            }
            currentPlayer = !currentPlayer; 
        }
    }
}
