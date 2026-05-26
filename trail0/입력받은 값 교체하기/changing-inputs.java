import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String strA = sc.next();
        String strB = sc.next();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.printf("%d %d", a, b);
    }
}