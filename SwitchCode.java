import java.util.Scanner;

public class SwitchCode {
    public static void main(String[] aStrings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int value= scanner.nextInt();
        switch (value) {
            case 5:
                System.out.println("case1");
            case 10:
                System.out.println("case2");
            default:
                System.out.println("case 3");
        }
        scanner.close();
    }
}
