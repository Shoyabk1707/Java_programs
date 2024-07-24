import java.util.*;
public class Percentage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sub,n,out_of;
        float perc,mark=0,total,sum=0;

        System.out.println("       Percentage Calculator          ");
        System.out.println("_______________________________________");
        System.out.println();

        System.out.print("Enter no. of subjects : ");
        sub = input.nextInt();

        System.out.print("Marks Out of  : ");
        out_of = input.nextInt();

        for(n=1; n<=sub; n++){
            System.out.print("Enter Marks of Sub "+n+" : ");
            mark = input.nextInt();
            sum+=mark;
        }
        total=sub*out_of;

        perc=(sum*100)/total;
        System.out.println();
        System.out.println("Percentage : "+perc + "%");

    }
}
