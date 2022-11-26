// 행렬곱셈순서 동적 프로그래밍
import java.io.*;
import java.util.Scanner;

public class matrixChain {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner scanner = new Scanner(System.in);
	public static int N = scanner.nextInt();
	
	public static int dpnum = 0;
	
	public static void main(String[] args) throws IOException {
		int d[] = new int[N + 1];
		
		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			d[i] = Integer.parseInt(split[0]);
			d[i + 1] = Integer.parseInt(split[1]);
		}
		
		long[][] dp = new long[N + 1][N + 1];
		for (int idx = 1; idx < N; idx++) {
			for (int i = 1; i <= N; i++) {
				int j = i + idx;
				dp[i][j] = Long.MAX_VALUE;
				for (int k = i; k< j; k++) {
					dp[i][j] = Math.min(dp[i][k] + dp[k + 1][j] + d[i - 1] * d[k] * d[j], k);
					dpnum++;
				}
			}
		}
		
		System.out.print("동적 프로그래밍 : ");
		System.out.println(dp[1][N]);
		System.out.printf("실행횟수 : %d", dpnum);
		
		scanner.close();
	}
}
