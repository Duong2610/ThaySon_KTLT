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
public class Bai5 {
    static int C[][]= new int[1001][1001];
    static int M=1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time=in.nextInt();
        while(time-- >0){
            int n=in.nextInt();
            int k=in.nextInt();
            for(int i=1;i<=n;i++){
                C[i][i]=1;
                for(int j=0;j<i;j++){
                    if(j==0||j==n) C[i][j]=1;
                    else C[i][j] = (C[i - 1][j - 1] + C[i - 1][j])%M;
                }
            }
            System.out.println(C[n][k]);
        }
    }
}
