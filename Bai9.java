/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duong
 */
import java.util.*;

public class Bai9 {

    static int F[][] = new int[1001][1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        while (time-- > 0) {
            int n, m;
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int a = in.nextInt();
                    if (i == 1 && j == 1) {
                        F[i][j] = a;
                    } else if (i == 1) {
                        F[i][j] = F[i][j - 1] + a;
                    } else if (j == 1) {
                        F[i][j] = F[i - 1][j] + a;
                    } else {
                        F[i][j] = Math.min(F[i - 1][j - 1], Math.min(F[i - 1][j], F[i][j - 1])) + a;
                    }
                }
            }
            System.out.println(F[n][m]);
        }
    }
}
