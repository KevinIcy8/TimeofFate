import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RunFromFate {
    public static void main(String[] args) throws InterruptedException {
        Scanner fate = new Scanner(System.in);
        System.out.print("Welcome to Time Of Fate!\nYou will now be determining your class.\nPress r to be royalty\nPress c to be a commoner\nPress p to be a peasant\nPress 0 for your class to be determine by Fate\nYour choice: ");
       String choice = fate.nextLine();
        if(choice == "0"){

        }
        TimeOfFate classFate = new TimeOfFate(choice);

        classFate.classAttribute();
        System.out.println(classFate.getCurrentAttribute());

    }
}
