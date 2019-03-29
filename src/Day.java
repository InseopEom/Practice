import java.util.Random;
import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		int num;
        System.out.print("0~99까지 수를 입력하세요 ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int k = r.nextInt(100);

        while (true) {
            num = sc.nextInt();
            if (num > k) {
                System.out.println("Down 다시");
            } else if (num < k) {
                System.out.println("Up 다시");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }

	}


