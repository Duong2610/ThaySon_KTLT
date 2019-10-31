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
public class Bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int tt = Integer.parseInt(t);
        
        while(tt-- >0){
            int len = 0;
            String s = in.nextLine();
            if(s.length() == 0)
                System.out.println(0);
            else{
                for(int i=0;i<s.length();i++){
                    int len1 = expand(s, i, i);
                    int len2 = expand(s,i,i+1);
                    len = Math.max(len, Math.max(len1, len2));
                }
            }
            System.out.println(len);
        }
    }
    
    static int expand(String s, int left, int right){
        int l = left, r = right;
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    
    }
}
