import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        int average = total / 3;
        System.out.println(total);
        System.out.println(average);
        System.out.println(total - average);
    }
}