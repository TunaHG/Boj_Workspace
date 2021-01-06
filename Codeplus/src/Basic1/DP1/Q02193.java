package Basic1.DP1;

import java.util.Scanner;

public class Q02193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long[][] dp = new long[N + 1][2];
		dp[1][1] = 1;
		
		for(int i = 2; i <= N; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
			dp[i][1] = dp[i - 1][0];
		}
		
		System.out.println(dp[N][0] + dp[N][1]);
	}

}