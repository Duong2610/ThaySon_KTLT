/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

/**
 *
 * @author Shinigami
 */
import java.util.*;

public class bai11 {

    /**
     * @param args the command line arguments
     */
    static LinkedList<Integer> dsKe[];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        dsKe = new LinkedList[n + 1];
        for (int i = 1; i <= n; i++) {
            dsKe[i] = new LinkedList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String[] arr = s.trim().split(" ");
            for (int j = 0; j < arr.length; j++) {
                dsKe[i].add(Integer.parseInt(arr[j]));
            }
        }
        print();
    }

    public static void print() {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < dsKe[i].size(); j++) {
                if(dsKe[i].get(j) > i){
                    System.out.println(i + " " + dsKe[i].get(j));
                }
                
            }
        }
    }

}
