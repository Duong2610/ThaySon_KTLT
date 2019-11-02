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
public class bai7 {
    static int F[]= new int[100005];
    static int pr[]= new int[100005];
    static int M=(int) 1e9+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time =in.nextInt();
        F[0]=1;pr[0]=1;
        while(time-- >0){
            int n=in.nextInt();
            int k=in.nextInt();
            for(int i=1;i<=n;i++){
                if(i-k>0) F[i]=(pr[i-1]-pr[i-k-1]+M)%M;
                else F[i]=pr[i-1];
                pr[i]=(F[i]+pr[i-1])%M;
            }
            System.out.println(F[n]);
        }
    }
}
