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
		
		System.out.println("�̸�, ����, ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� " + name+", ");
		
		String city = scanner.next();
		System.out.print("���ô� "+city+", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� "+age+'��');
		
		scanner.close();
	}

}
