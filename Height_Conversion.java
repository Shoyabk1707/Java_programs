import java.text.DecimalFormat;
import java.util.*;

public class Height_Conversion {
    public static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int opt=0;
        double cm,ft;

        System.out.println("       Height Conversion           ");
        System.out.println("___________________________________");

        System.out.println("1) cm to ft");
        System.out.println("2) ft to cm");

        System.out.print("Choose a Option  : ");

        opt = input.nextInt();

        if(opt==1){
            System.out.print("Enter lenght in cm : ");
            cm=input.nextInt();

            ft = cm/30.48;

            System.out.println("In feet : "+decfor.format(ft));

        }
        else {
            System.out.print("Enter lenght in ft : ");
            ft=input.nextDouble();

            cm = ft*30.48;

            System.out.println("In cm : "+decfor.format(cm));

        }

    }
}
