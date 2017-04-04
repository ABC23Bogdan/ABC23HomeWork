package Home;

import java.util.Scanner;

/**
 * Created by Asus on 04.04.2017.
 */
public class _05NumberDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        if (0 > d && d > 1) {
            System.out.println("Number in range of 0 to 1");
        } else {
            System.out.println("Number not in range of 0 to 1");
        }
    }
}
