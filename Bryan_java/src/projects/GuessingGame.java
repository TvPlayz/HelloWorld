package projects;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		{
		    boolean play = true;
		    String input1;

		    while(play == true){
		        Scanner input = new Scanner(System.in);
		        Random rand = new Random();
		        int counter = 0;
		        int guess = -1;
		        int dif = 0;
		        int easy = rand.nextInt(10) + 1, med = rand.nextInt(1000) + 1, hard = rand.nextInt(10000) + 1; 

		        System.out.println("Difficulty Select");
		        System.out.println("=================");
		        System.out.print("1) Easy   2) Medium   3) Hard     :");
		        dif = input.nextInt();

		        switch (dif)
		        {
		            case 1:
		                if (dif == 1)
		                    System.out.println ("Random number between 1 and 10 selected." + easy);
		                else if (dif == 3)
		                    System.out.println ("Random number between 1 and 10000 selected.");
		            break;


		        }
		        while (guess != med)
		        {
		            System.out.print ("|" + med + "|" + "Random number between 1 and 1000 selected.");
		            guess = input.nextInt();
		            counter = counter + 1;

		            if (guess == med)
		                System.out.println ("YOU WIN MOFO!");
		            else if (guess < med)
		                System.out.println ("You're to cold!");
		            else if (guess > med)
		                System.out.println ("You're to hot!");
		        }

		        System.out.println ("It took you " + counter + " guess(es) to get it correct"); 
		        System.out.print ("Do you want to play again? (y/n): ");
		        input1 = input.nextLine();  // absorb enter key from integer
		        input1 = input.nextLine();

		        if (input1.equals("y"))
		           play = true;
		        else
		           play = false;

		            }

	}
	}
}
