// Çà·Ä°ö¼À¼ø¼­ Àç±ÍÇÔ¼ö
import java.io.*;
import java.util.Scanner;

public class rmatrixChain {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner scanner = new Scanner(System.in);
	public static int N = scanner.nextInt();
	
	public static int renum = 0;
	
	public static void main(String[] args) throws IOException {
		int d[] = new int[N + 1];
		
		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			d[i] = Integer.parseInt(split[0]);
			d[i + 1] = Integer.parseInt(split[1]);
		}
		
		System.out.print("Àç±ÍÇÔ¼ö : ");
		System.out.printf("%d", recursive(1, N, d));
		System.out.printf("½ÇÇàÈ½¼ö : %d", renum);
		
		scanner.close();
	}
	
	public static int recursive(int a, int b, int[] d) {
		if (a == b) {
			renum++;
			return 0;
		}
		else {
			int result = 0;
			int min = Integer.MAX_VALUE;
			
			for (int k = a; k<b; k++) {
				result = recursive(a, k, d) + recursive(k+1, b, d) + d[a - 1] * d[k] * d[b];
				renum++;
				if (result < min)
					min = result;
			}
			return min;
		}
	}
}
