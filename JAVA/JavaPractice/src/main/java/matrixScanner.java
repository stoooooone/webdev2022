
import java.util.Scanner;

public class matrixScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//행, 열의 개수 입력받기
		System.out.println("몇 행, 몇 열을 입력하시겠습니까?");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int Array[][] = new int[row][col];	//입력받은 크기로 행렬 생성
		
		System.out.println("행렬을 입력하세요\n");
		for (int r=0;r<row;r++) {	//입력받은 수 넣기
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
		
		int rsum = 0;	//행의 합을 보관할 변수
		int csum = 0;	//열의 합을 보관할 변수
		
		System.out.println("Row sum");
		for (int r=0; r<row; r++) {
			for (int c=0; c<col; c++) {
				rsum += Array[r][c];	//행의 합 계산
			}
			System.out.println("Sum of " + (r+1) + "th row : " + rsum);
			rsum = 0;	//행의 합 초기화
		}
		
		System.out.println("\nColumn sum");
		for (int c=0; c<col; c++) {
			for (int r=0; r<row; r++) {
				csum += Array[r][c];	//열의 합 계산
			}
			System.out.println("Sum of " + (c+1) + "th col : " + csum);
			csum = 0;
		}
		
		scanner.close();
	}

}
