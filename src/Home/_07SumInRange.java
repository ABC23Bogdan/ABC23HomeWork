package Home;
import java.util.Scanner;

/**
 * Created by Asus on 04.04.2017.
 */
public class _07SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;

        if (sum >= 11 && sum <= 19 ){
            System.out.println("Sum in range of 11 to 19 : "+sum);
        }
        else {
            System.out.println("Sum isn't in range. ");
        }
    }
}

