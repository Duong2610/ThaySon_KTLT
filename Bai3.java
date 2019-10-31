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
public class Bai3 {
    static int a[]= new int[1001];
    static int F[]= new int [1001];
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       int ans=0;
       for(int i = 1; i <= n; i++){
           a[i]=in.nextInt();
       }
	for(int i = 1; i <= n; i++){
		F[i] = 1;
		for(int j = 1; j < i; j++)
			if(a[j] < a[i]) F[i] = Math.max(F[i], F[j] + 1);
			
		ans = Math.max(ans, F[i]);
	}
        System.out.println(ans);
    }
}
