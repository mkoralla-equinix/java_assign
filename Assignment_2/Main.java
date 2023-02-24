import java.util.*;

public class Main {
    public int getWinnerIndex(String[] contestants, int[] songStepInSec)
    {
        int number=1, counter=0, dead=0,persons=1;
        int lenOfTimer=songStepInSec.length;
        int len=contestants.length;
        int[] alive=new int[len];
        for(int i=0;i<len;i++)
        {
            alive[i]=1;
        }
        while(number<len-1)
        {
            while (persons <= songStepInSec[counter])
            {
                dead++;
                dead = dead % len;
                if (alive[dead] == 1)
                {
                    persons++;
                }
            }
            alive[dead] = 0;
            dead++;
            dead = dead % len;
            while (alive[dead] == 0)
            {
                dead++;
                dead = dead % len;
            }
            counter++;
            counter = counter % lenOfTimer;
            number++;
            persons = 1;
        }
        return dead+1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numberOfPlayers=sc.nextInt();
        String contestants[]=new String[numberOfPlayers+1];
        for(int i=0;i<=numberOfPlayers;i++)
        {
            contestants[i]=sc.nextLine();
        }
        System.out.println("Enter the number of timers");
        int numberOfTimers=sc.nextInt();
        int songStepInSec[]=new int[numberOfTimers];
        for(int i=0;i<numberOfTimers;i++)
        {
            songStepInSec[i]=sc.nextInt();
        }
        Main m=new Main();
        int winnerIndex=m.getWinnerIndex(contestants,songStepInSec);
        System.out.println("The winner is "+contestants[winnerIndex]);
    }
}