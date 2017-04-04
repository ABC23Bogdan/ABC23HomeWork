package Home;

        import javax.sound.midi.Soundbank;
        import java.util.Scanner;

/**
 * Created by Asus on 04.04.2017.
 */
public class _03BiggestAndSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Biggest is " +Math.max(n1, (Math.max(n2, n3))));
        System.out.println("Smaller is " +Math.min(n1, (Math.min(n2, n3))));

    }
}

