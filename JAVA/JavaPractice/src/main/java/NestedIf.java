import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int year = scanner.nextInt();
		
		if (score>60) {
			if (year != 4)
				System.out.println("합격!");
			else if (score >= 70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}
		else
			System.out.println("불합격!");
		
		scanner.close();		
	}
}
