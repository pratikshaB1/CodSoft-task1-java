
import java.lang.Math;
import java.util.*;
class NumberGame
{
    public static void main(String Args[])
    {
        int exit = 1;

        while(exit != 0)
        {
        int min = 1;
        int max = 100;
        int iCnt = 0;
        int star = 0;
        Scanner sobj = new Scanner(System.in);

        int No = (int)(Math.random()*(max-min+1)+min);
        //System.out.println("1st Random Number : "+ No);
        System.out.println("-------------------------------------------------");
        System.out.println("#######-----WELCOME TO NUMBER GAME-----#######");
        System.out.println("-------------------------------------------------");

        System.out.println("Which Type Of Game You want to Play : ");
        System.out.println("1.Single Round");
        System.out.println("2.Multiple Rounds");
        int Choice = sobj.nextInt();

        if(Choice == 1)
        {

        System.out.println("*******************************************");
        System.out.println("You have Total Guess are : 3");
        System.out.println("*******************************************");
        
         for(int i = 1;i <= 3;i++)
        {
            System.out.println("Guess No : "+i);
            System.out.println("Enter the Guess of Number Here : ");
            int Guess = sobj.nextInt();

            int Value1 = Integer.compare(Guess, No);

            if(Guess == No)
            {
                iCnt++;
                System.out.println("You Won !!! The Guess Was Correct!!!");
                break;
            }
            else if(Value1 == 0)
            {
                System.out.println("The Guess value was Equal to Goal !!! ");
            }
            else if(Value1 < 0)
            {
                System.out.println("The Guess value was Smaller than Goal !!! ");
            }
            else if(Value1 > 0)
            {
                System.out.println("The Guess value was Greater than Goal !!! ");
            }
            
        }

        System.out.println("The Generated Number was : "+No);

        if(iCnt > 0)
        {
            System.out.println("You have won !!!! Congratulations");
        }
        else
        {
            System.out.println("Game Over !!!!");
        }
        System.out.println("Do you want to Continue !!! Then Enter : 1");
        System.out.println("Do you want to exit !!! Then Enter : 0");
        exit = sobj.nextInt();
        
    }

    else if(Choice == 2)
    {
        System.out.println("--------Welcome To Multiple Rounds You Have 5 Rounds--------");
        System.out.println("*******************************************");
        System.out.println("You have Total Guess are : 3 In Each Round");
        System.out.println("*******************************************");

        for(int j = 1;j <= 5;j++)
        {
            System.out.println("*********** Round No : "+j+" Started !!!! ************");
            No = (int)(Math.random()*(max-min+1)+min);

            for(int i = 1;i <= 3;i++)
            {
                    System.out.println("Guess No : "+i);
                    System.out.println("Enter the Guess of Number Here : ");
                    int Guess = sobj.nextInt();

                    int Value1 = Integer.compare(Guess, No);

                    if(Guess == No)
                    {
                        System.out.println("You Won Round "+j+" !!! The Guess Was Correct!!!");
                        star++;
                        break;
                    }
                    else if(Value1 == 0)
                    {
                        System.out.println("The Guess value was Equal to Goal !!! ");
                    }
                    else if(Value1 < 0)
                    {
                        System.out.println("The Guess value was Smaller than Goal !!! ");
                    }
                    else if(Value1 > 0)
                    {
                        System.out.println("The Guess value was Greater than Goal !!! ");
                    }

            }
            System.out.println("The Generated Number was : "+No);
            System.out.println("---------------------------------------------------------------");

            
        }
        System.out.println("***********************************************************");
        System.out.println("Number of Rounds You won are : "+star+" Outoff 5 Rounds");
        System.out.println("***********************************************************");

        if(star > 0)
        {
            System.out.println("######################################################");
            System.out.println("     Congratulations !!!! Congratulations !!!!        ");
            System.out.println("######################################################");
        }
        else 
        {
            System.out.println("-----XXX---------- GAME OVER ------------XXX-----");
        }

        System.out.println("Do you want to Continue !!! Then Enter : 1");
        System.out.println("Do you want to exit !!! Then Enter : 0");
        exit = sobj.nextInt();
        sobj.close();

    }
    else
    {
        System.out.println("Invalid Input...");
    }
}
    
    
    }
}