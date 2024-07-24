import java.util.*;
import java.math.*;

public class no_guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count=0,t=5;
        int user=0;


        int n= (int) (Math.random()*10);
   
        while(user!=n){
            System.out.print("Enter a no. : ");
            user = input.nextInt();

            count++;


            System.out.println("You have " + (t - count) + " chances left.");


            if(user<n){
                System.out.println("Too Low ! Choose a high number");
            }

            if(user>n){
                System.out.println("Too High ! Choose a Low number");
            }

            if(user==n){

                    System.out.println("Yeah ! you win");

            }

            if(count==5){
                System.out.println("OOPS ! you lose");
                break;
            }
        }

    }
}
