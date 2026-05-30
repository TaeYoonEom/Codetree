import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        System.out.printf("%d ", st);

        while(st < end){
            if(st % 2 == 0){
                st = st + 3;
            }else{
                st = st * 2;
            }
            if (st > end) {
                break; // 넘었다면 출력하지 않고 즉시 while문 탈출!
            }
            System.out.printf("%d ", st);
        }
    }
}