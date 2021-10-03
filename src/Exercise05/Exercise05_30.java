package Exercise05;

/*Author@ Devasya joshi (20CS020)
 *Craps is a popular dice game played in casinos. Write a program to play a
 *variation of the game, as follows: Roll two dice. Each die has six faces
 *representing values 1, 2, . . ., and 6, respectively.
 *Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 *lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 *(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 *a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 *Your program acts as a single player. Here are some sample runs.
 */

import java.util.Random;
//declared public class exercise05_30
public class Exercise05_30
{
    public static void main(String[] args)
    {
        //declared variables as integers
        int dice1,dice2;
        dice1=(int)(Math.random()*6+1);
        dice2=(int)(Math.random()*6+1);
        int sum = dice1 + dice2;
        boolean gameplay = true;

        //display the sum of dice1 and dice2
        System.out.println("You rolled " +dice1+ " + " +dice2+ " = " +sum);

        //used nested if else loop for given conditions
        if ((sum==2)||(sum==3)||(sum==12))
        {
            gameplay = false;
            System.out.println("You lose,try again");
        } else

        if ((sum==7)||(sum==11))
        {
            gameplay = false;
            System.out.println("You win");
        } else

            System.out.println("Your total points is/are "+sum);

        //Declaring variable newSum as integer
        int newSum;
        while (gameplay)
        {
            newSum = dice1+dice2;
            System.out.println("You rolled "+dice1+" + "+dice2+" = "+newSum);
            if (newSum==sum)
            {
                gameplay = false;
                System.out.println("You win");

            } else
            if (newSum==7)
            {
                gameplay =false;
                System.out.println("You lose");
            }
            else
            {
                System.out.println("point is "+sum);
            }

        }

    }

}
