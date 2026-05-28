import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        char[] charArray = a.toCharArray();

        charArray[1] = 'a';
        charArray[charArray.length - 2] = 'a';

        String result = new String(charArray);
        System.out.println(result);
    }
}