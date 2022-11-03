import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요");
		int number = scanner.nextInt();
		int what = number % 2;
		
		switch (what) {
			case 0 :
				System.out.println("짝수입니다");
				break;
			case 1 :
				System.out.println("홀수입니다");
				break;
		}
		
		scanner.close();
	}
}
