import java.util.Scanner;

public class Hello {
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);	
		
		System.out.println("이름, 도시, 나이를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name+", ");
		
		String city = scanner.next();
		System.out.print("도시는 "+city+", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 "+age+'살');
		
		scanner.close();
	}

}
