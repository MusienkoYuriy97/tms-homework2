import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A:");
        int a = scanner.nextInt();
        System.out.print("Input B:");
        int b = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < b ; i++) {
            result += a;
        }
        System.out.println("A + B = " + result);
    }
}
