package Home;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Asus on 04.04.2017.
 */
public class _04Divided7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter random number: ");
        int n = sc.nextInt();

        if (n % 7 != 0) {
            System.out.println("error");
        } else {
            System.out.println(n * 2);
        }
    }
}
