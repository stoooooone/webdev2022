import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���");
		int number = scanner.nextInt();
		int what = number % 2;
		
		switch (what) {
			case 0 :
				System.out.println("¦���Դϴ�");
				break;
			case 1 :
				System.out.println("Ȧ���Դϴ�");
				break;
		}
		
		scanner.close();
	}
}
