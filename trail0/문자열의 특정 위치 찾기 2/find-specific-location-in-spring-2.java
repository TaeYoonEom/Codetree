import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);
        String [] str = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        for(int i = 0; i < 5; i++) {
            if (str[i].length() >= 5) {
                if ((str[i].charAt(2) == A) || (str[i].charAt(3) == A)) {
                    cnt += 1;
                    System.out.println(str[i]);
                }
            }
        }
        System.out.println(cnt);
    }
}