
import java.util.Scanner;

public class matrixScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//��, ���� ���� �Է¹ޱ�
		System.out.println("�� ��, �� ���� �Է��Ͻðڽ��ϱ�?");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int Array[][] = new int[row][col];	//�Է¹��� ũ��� ��� ����
		
		System.out.println("����� �Է��ϼ���\n");
		for (int r=0;r<row;r++) {	//�Է¹��� �� �ֱ�
			for (int c=0; c<col; c++) {
				Array[r][c] = scanner.nextInt();
			}
		}
		
		System.out.println("\nOriginal Matrix");
		for (int r=0; r<row; r++) {
			for (int c=0; c<col;c++) {
				System.out.print(Array[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int rsum = 0;	//���� ���� ������ ����
		int csum = 0;	//���� ���� ������ ����
		
		System.out.println("Row sum");
		for (int r=0; r<row; r++) {
			for (int c=0; c<col; c++) {
				rsum += Array[r][c];	//���� �� ���
			}
			System.out.println("Sum of " + (r+1) + "th row : " + rsum);
			rsum = 0;	//���� �� �ʱ�ȭ
		}
		
		System.out.println("\nColumn sum");
		for (int c=0; c<col; c++) {
			for (int r=0; r<row; r++) {
				csum += Array[r][c];	//���� �� ���
			}
			System.out.println("Sum of " + (c+1) + "th col : " + csum);
			csum = 0;
		}
		
		scanner.close();
	}

}
