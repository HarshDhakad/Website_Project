import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        int compWins=0,userWins=0;
        System.out.println("HELLO FRIEND , IT IS A ROCK PAPER AND SCISSOR GAME . YOU HAVE TO WIN MORE THAN 2 MATCHES FOR WINNING THE COMPETITION.");
        System.out.println("HERE, \nFOR ROCK CHOOSE 1 \nFOR PAPER CHOOSE 2 \nFOR SCISSOR CHOOSE 3");
        for(int i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            Random var = new Random();
            int comp = var.nextInt(0, 4);

            switch (user) {
                case 1:
                    System.out.println("You choose rock");
                    break;
                case 2:
                    System.out.println("You choose paper");
                    break;
                case 3:
                    System.out.println("You choose scissor");
                    break;
                default:
                    System.out.println("You donot choose perfect number");
                    i--;
            }
            if (user <= 3) {
                switch(comp) {
                    case 1:
                        System.out.println("Computer choose rock");
                        break;
                    case 2:
                        System.out.println("Computer choose paper");
                        break;
                    case 3:
                        System.out.println("Computer choose scissor");
                        break;
                }
            }
            if (user == 1 && comp == 2) {System.out.println("computer wins"); compWins++;}
            else if (user == 1 && comp == 3) {System.out.println("user wins"); userWins++;}
            else if (user == 2 && comp == 1) {System.out.println("user wins"); userWins++;}
            else if (user == 2 && comp == 3) {System.out.println("computer wins"); compWins++;}
            else if (user == 3 && comp == 1) {System.out.println("computer wins"); compWins++;}
            else if (user == 3 && comp == 2){ System.out.println("user wins"); userWins++;}
            else System.out.println("Tie");
        }
         if(userWins>compWins){
             System.out.println("\n\n##USER WINS THE COMPETITION. \n GOOD LUCK");
         }
         else if(userWins==compWins)
             System.out.println("TIE THE MATCH .\nGOOD LUCK FOR NEXT MATCH");
         else System.out.println("COMPUTER WINS THE COMPETITION .\nGOOD LUCK FOR NEXT MATCH");
        System.out.println("I WISH YOU ENJOY THIS GAME .");
    }

}