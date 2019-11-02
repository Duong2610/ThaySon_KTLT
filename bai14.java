/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tuan3;

/**
 *
 * @author Shinigami
 */
import java.util.*;

public class bai14 {

    /**
     * @param args the command line arguments
     */
    static LinkedList<Integer> dsKe[];
    static int t, n, m, q;
    static boolean chuaXet[];
    static int a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            dsKe = new LinkedList[n + 1];
            for (int i = 1; i <= n; i++) {
                dsKe[i] = new LinkedList<Integer>();
            }
            m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                dsKe[a].add(b);
                dsKe[b].add(a);
            }
//            print();
            q = sc.nextInt();
            while (q-- > 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                DFS(a);
                if (chuaXet[b]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }

    public static void DFS(int s) {
        chuaXet = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            chuaXet[i] = true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        while (!stack.isEmpty()) {
            s = stack.pop();
            if (chuaXet[s]) {
//                System.out.print(s + "");
                chuaXet[s] = false;
            }
            for (int i : dsKe[s]) {
                if (chuaXet[i]) {
//                    System.out.println("i : " + i);
                    stack.push(s);
                    stack.push(i);
                    break;
                }
            }
        }
//        for(int i =1 ; i <= n; i++)
//            System.out.println(chuaXet[i]);
    }

    public static void print() {
        for (int i = 1; i <= n; i++) {
            System.out.print("tai " + i + ": ");
            for (int j : dsKe[i]) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
