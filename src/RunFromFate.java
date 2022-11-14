import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RunFromFate {
    public static void main(String[] args) throws InterruptedException {
        Scanner fate = new Scanner(System.in);
        TimeOfFate time = new TimeOfFate();
        System.out.println(time.classAttribute());
    }
}
