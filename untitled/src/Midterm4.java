public class Midterm4 {
    public static void main(String[] args) {
        int[][] city = {{1, 2, 1, 3}, {2, 1, 4, 2}, {3, 1, 2, 3}, {2, 3, 2, 1}};
        int row = city.length;
        int col = city[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = city[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j-1] + city[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + city[i][j];
                } else {
                    dp[i][j] = Integer.min(dp[i][j - 1], dp[i - 1][j]) + city[i][j];
                }
            }
        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }

        System.out.println(dp[row-1][col-1]-city[row-1][col-1]);
    }
}
