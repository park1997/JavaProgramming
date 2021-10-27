public class Midterm3 {
    public static void main(String[] args) {
        int N = 4;
        int[] hotelcost = {2, 2, 5, 0};
        int[] aircost = {1, 4, 9, 16};
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = dp[0] + aircost[0] + hotelcost[2];
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + aircost[0] + hotelcost[N - i - 1];
            for (int j = 0; j < i; j++) {
                dp[i] = Integer.min(dp[i], dp[j] + aircost[i - j - 1] + hotelcost[N - i - 1]);
            }
        }
        dp[N] = dp[N - 1] + aircost[0];
        for (int i = 0; i < N; i++) {
            dp[N] = Integer.min(dp[i] + aircost[N - i - 1], dp[N]);
        }
        System.out.println(dp[N]);
    }
}
