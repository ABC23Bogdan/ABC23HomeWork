package Home;
import java.util.Scanner;


/**
 * Created by Asus on 04.04.2017.
 */
public class _06TwoNumbers {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int dif = n1 - n2;

        if (n1 > n2 ){
            System.out.println(dif);
        }
        else if (n2 > n1 ){
            System.out.println(sum);
        }
    }
}
