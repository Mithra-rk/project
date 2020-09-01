import java.util.*;
public class NumberGuess
{
	static int ask()
	{
		System.out.println("Do you want to continue y/n ");
		  Scanner sc= new Scanner(System.in);
		  char a=sc.next().charAt(0);
		  if(a=='y')
			return 0;
		  else if(a=='n')
			return 1;
		  else 
		{
			System.out.println("Invalid");
			return ask();
		}
	}
	public static void main(String[] args) 
	{
            int guess,secretNum;
            secretNum=(int)(Math.random()*999+1);
            Scanner sc= new Scanner(System.in);
	    do
	    {
		  System.out.println("Enter the guess number:");
		  guess=sc.nextInt();
                  if (guess==secretNum)
                        System.out.println("Your guess is correct. Congratulations!");
                  else if (guess<secretNum)
                        System.out.println("Your guess is smaller than the secret number.");
                  else if (guess>secretNum)
                        System.out.println("Your guess is greater than the secret number.");
		  int x=ask();
		  if(x==1)
			break;
	    }
	    while(guess!=secretNum);
        }
}