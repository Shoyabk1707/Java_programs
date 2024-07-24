import java.util.*;

public class currency_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ruppee,dollar;
        int op;

        System.out.println("        CURRENCY CONVERTOR          ");
        System.out.println("____________________________________");
        System.out.println();

        System.out.println("1) Ruppee to Dollar");
        System.out.println("2) Dollar to Ruppee");
        System.out.print("Choose a option  : ");
        op=input.nextInt();

        if(op==1){
            System.out.print("Enter amount in ruppee : ");
            ruppee=input.nextFloat();
            dollar= (float) (ruppee*0.012);
            System.out.println("Dollar : "+dollar+ " $");

        }
        else{
            System.out.print("Enter amount in dollar : ");
            dollar=input.nextFloat();
            ruppee= (float) (dollar*82.85);
            System.out.println("Ruppee : "+ruppee+ " rs");

        }

    }
}
