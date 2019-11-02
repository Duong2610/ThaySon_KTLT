/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//int x = Integer.parseInt(s.nextToken)

/**
 *
 * @author duong
 */
import java.util.*;
public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[][]= new int[1001][1001];
        int n= Integer.parseInt(in.nextLine());
        char c;
        int t=n;
        int x=0;
        while(n-->0){
            String s;
            s=in.nextLine();
            StringTokenizer s1 = new StringTokenizer(s);
            while(s1.hasMoreTokens()){
                int s2=Integer.parseInt(s1.nextToken());
                A[x][s2-1]=1;
            }
            x++;
        }
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
