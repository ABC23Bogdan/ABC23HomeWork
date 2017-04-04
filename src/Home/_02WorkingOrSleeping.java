package Home;

import java.util.Scanner;

/**
 * Created by Asus on 03.04.2017.
 */
public class _02WorkingOrSleeping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time: ");
        int t = sc.nextInt();

        if (t >= 0 && t <= 24 && t >= 9 && t <= 18) {
            System.out.println("Im at work.");

        } else {
            System.out.println("Im sleeping.");
        }
    }
}