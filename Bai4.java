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
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int check =0;
        int n=in.nextInt(); 
        int S=in.nextInt();
        int a[]= new int[202];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                temp+=a[i];
                if(temp==S){
                    check=1;
                    break;
                }
            }
        }
        if(check==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
