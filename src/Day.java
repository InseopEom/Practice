import java.util.Random;
import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		int num;
        System.out.print("0~99���� ���� �Է��ϼ��� ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int k = r.nextInt(100);

        while (true) {
            num = sc.nextInt();
            if (num > k) {
                System.out.println("Down �ٽ�");
            } else if (num < k) {
                System.out.println("Up �ٽ�");
            } else {
                System.out.println("����");
                break;
            }
        }
    }

	}


